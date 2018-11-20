package com.mobile_core.module_main.main;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mobile_core.module_main.R;
import com.mobile_core.module_main.databinding.FragmentCampaignListBinding;

/**
 * Created by picher on 2018/7/31.
 * Describe：
 */

public class DemoFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FragmentCampaignListBinding fragmentCampaignListBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_campaign_list,container,false);
        return fragmentCampaignListBinding.getRoot();
    }
}
