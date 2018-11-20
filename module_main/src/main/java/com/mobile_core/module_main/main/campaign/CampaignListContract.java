package com.mobile_core.module_main.main.campaign;

import com.mobile_core.base.BasicView;
import com.mobile_core.base.BasicViewModel;
import com.mobile_core.base.bean.CampaignListBean;

import java.util.List;

/**
 * Created by picher on 2018/7/26.
 * Describe：
 */

public class CampaignListContract {
    public interface View extends BasicView {
        void showList(List<CampaignListBean> listBeans);
    }

    public interface ViewModel extends BasicViewModel {
        void requestListData(String typeId);
    }
}
