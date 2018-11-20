package com.mobile_core.module_main.main;

import com.mobile_core.base.bean.CampaignListBean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by picher on 2018/7/27.
 * Describe：Data source manager class
 */

public class DataEngine {

    public static List<CampaignListBean> createCampaignList(int size) {
        List<CampaignListBean> campaignListBeans = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            campaignListBeans.add(createCampaignListBean());
        }
        return campaignListBeans;
    }

    private static CampaignListBean createCampaignListBean() {
        CampaignListBean listBean = new CampaignListBean();
        listBean.setTitle("体育馆，两人场2小时 每人50");
        return listBean;
    }
}
