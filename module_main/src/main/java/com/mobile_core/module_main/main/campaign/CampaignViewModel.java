package com.mobile_core.module_main.main.campaign;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.OnLifecycleEvent;

import com.mobile_core.base.manager.UserManager;
import com.mobile_core.base.manager.router.RouterManager;
import com.mobile_core.base.mvvm.ParentViewModel;
import com.mobile_core.module_main.main.Constants;

import java.util.Arrays;
import java.util.List;

/**
 * Created by picher on 2018/7/20.
 * Describe：
 */

public class CampaignViewModel extends ParentViewModel<CampaignContract.View>
        implements CampaignContract.ViewModel{

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void onCreate(){
        view.showTabList(getTabList());
    }

    @Override
    public List<String> getTabList() {
        return Arrays.asList(Constants.HOME_TAB_LIST);
    }

    @Override
    public void onFabClick(){
        if(!UserManager.getInstance().isLogin()){
            RouterManager.getInstance().startActivity(RouterManager.MODEL_PERSONA_LOGIN);
        }else{
            // 打开界面
        }
    }
}
