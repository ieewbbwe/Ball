package com.mobile_core.module_personal.main.utils;

import android.text.TextUtils;
import android.util.Log;

import com.mobile_core.base.utils.StringUtils;
import com.mobile_core.module_personal.R;
import com.mobile_core.module_personal.main.LoginRequester;

/**
 * Created by picher on 2018/11/20.
 * Describe：
 */
public class PersonalValidator {

    public static class Result{
        private boolean valid;
        private int errorMsg;

        public boolean isValid() {
            return valid;
        }

        public void setValid(boolean valid) {
            this.valid = valid;
        }

        public int getErrorMsg() {
            return errorMsg;
        }

        public void setErrorMsg(int errorMsg) {
            this.errorMsg = errorMsg;
        }
    }

    public static Result validateLogin(LoginRequester loginRequester){
        Result result = new Result();
        if(!TextUtils.isEmpty(loginRequester.getAccount()) && !TextUtils.isEmpty(loginRequester.getPassword())){
            result.valid = true;
        }else{
            result.valid = false;
            result.errorMsg = R.string.error_empty_info;
        }
        return result;
    }


    public static Result validatePhone(String account) {
        Log.d("picher","账号："+account);
        Result result = new Result();
        if(TextUtils.isEmpty(account)){
            result.valid = false;
            result.errorMsg = R.string.error_empty_account;
            return result;
        }

        if(!StringUtils.isPhone(account)){
            result.valid = false;
            result.errorMsg = R.string.error_re_phone;
            return result;
        }

        result.valid = true;
        return result;
    }

}
