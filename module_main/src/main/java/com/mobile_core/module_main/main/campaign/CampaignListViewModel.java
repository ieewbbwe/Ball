package com.mobile_core.module_main.main.campaign;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.OnLifecycleEvent;

import com.mobile_core.base.BuildConfig;
import com.mobile_core.base.mvvm.ParentViewModel;
import com.mobile_core.module_main.main.Constants;
import com.mobile_core.module_main.main.DataEngine;

import java.util.Arrays;
import java.util.List;

/**
 * Created by picher on 2018/7/26.
 * Describe：
 */

public class CampaignListViewModel extends ParentViewModel<CampaignListContract.View>
        implements CampaignListContract.ViewModel {

    @Override
    public void requestListData(String typeId) {
        if(!BuildConfig.USE_API_DATA){
            view.showList(DataEngine.createCampaignList(30));
        }
    }

}
