package com.mobile_core.module_main.main.campaign;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;

import com.github.jdsjlzx.recyclerview.LRecyclerViewAdapter;
import com.mobile_core.base.bean.CampaignListBean;
import com.mobile_core.base.mvvm.MFragment;
import com.mobile_core.module_main.R;
import com.mobile_core.module_main.databinding.FragmentCampaignListBinding;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by picher on 2018/7/27.
 * Describe：
 */

public class CampaignListFragment extends MFragment<CampaignListViewModel, FragmentCampaignListBinding>
        implements CampaignListContract.View {

    private static final String ARG_TYPE_ID = "arg_type_id";
    private String mCurrentType;
    private LinearLayoutManager linearLayoutManager;
    private CampaignListAdapter innerAdapter;
    private LRecyclerViewAdapter adapter;
    private List<CampaignListBean> listBeans = new ArrayList<>();

    public static CampaignListFragment newInstance(String typeId) {
        CampaignListFragment listFragment = new CampaignListFragment();
        Bundle bundle = new Bundle();
        bundle.putString(ARG_TYPE_ID, typeId);
        listFragment.setArguments(bundle);
        return listFragment;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        linearLayoutManager = new LinearLayoutManager(getSupportActivity());
        binding.campaignListRlv.setLayoutManager(linearLayoutManager);
        innerAdapter = new CampaignListAdapter(getSupportActivity());
        innerAdapter.setDataList(listBeans);
        adapter = new LRecyclerViewAdapter(innerAdapter);
        binding.campaignListRlv.setAdapter(adapter);
        binding.campaignListRlv.setPullRefreshEnabled(false);
        binding.campaignListRlv.setLoadMoreEnabled(false);

        if (getArguments() != null) {
            mCurrentType = getArguments().getString(ARG_TYPE_ID);
            viewModel.requestListData(mCurrentType);
        }

    }

    @Override
    protected CampaignListViewModel onCreateViewModel() {
        return new CampaignListViewModel();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_campaign_list;
    }

    @Override
    public void showList(List<CampaignListBean> list) {
        innerAdapter.addAll(list);
    }
}
