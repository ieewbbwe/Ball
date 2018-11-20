package com.mobile_core.module_main.main.campaign;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.mobile_core.base.manager.router.RouterManager;
import com.mobile_core.base.mvvm.MFragment;
import com.mobile_core.base.mvvm.ToolBarViewModel;
import com.mobile_core.module_main.R;
import com.mobile_core.module_main.databinding.FragmentCampaignBinding;

/**
 * Created by picher on 2018/7/20.
 * Describe：
 */
@Route(path = RouterManager.MODEL_CAMPAIGN_FRAGMENT)
public class CampaignFragment extends MFragment<CampaignViewModel, FragmentCampaignBinding> {

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }

    @Override
    protected CampaignViewModel onCreateViewModel() {
        return new CampaignViewModel();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_campaign;
    }
}
