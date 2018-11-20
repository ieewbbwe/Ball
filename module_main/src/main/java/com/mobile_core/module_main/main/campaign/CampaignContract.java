package com.mobile_core.module_main.main.campaign;

import com.mobile_core.base.BasicView;
import com.mobile_core.base.BasicViewModel;

import java.util.List;

/**
 * Created by picher on 2018/7/20.
 * Describe：
 */

public interface CampaignContract {
    public interface View extends BasicView {
        public void showTabList(List<String> mTabs);
    }

    public interface ViewModel extends BasicViewModel {
        List<String> getTabList();
        void onFabClick();
    }
}
