package com.mobile_core.module_personal.main;

import com.mobile_core.base.BasicView;
import com.mobile_core.base.BasicViewModel;

/**
 * Created by picher on 2018/7/18.
 * Describe：
 */

public interface LoginContract {

    public interface View extends BasicView{

        void countDownCallBack(boolean enable,int countTime);
    }

    public interface ViewModel extends BasicViewModel{
        void onReqCodeClick();
        void onRegisterClick();
        void onForgetPwdClick();
        void onLoginClick();
    }
}
