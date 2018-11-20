package com.mobile_core.module_personal.main;

import android.annotation.SuppressLint;
import android.databinding.Bindable;
import android.util.Log;

import com.mobile_core.base.mvvm.ParentViewModel;
import com.mobile_core.base.utils.rx.RxCountDown;
import com.mobile_core.module_personal.main.utils.PersonalValidator;

import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;

/**
 * Created by picher on 2018/7/18.
 * Describe：ViewModel of login page
 */

public class LoginViewModel extends ParentViewModel<LoginContract.View>
        implements LoginContract.ViewModel {

    private static int DEFAULT_COUNT_DOWN_TIME = 5;

    @Bindable
    private String account,password;

    @Bindable
    public String getAccount(){
        return account;
    }

    @Bindable
    public String getPassword(){
        return password;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @SuppressLint("CheckResult")
    @Override
    public void onReqCodeClick() {
        PersonalValidator.Result result = PersonalValidator.validatePhone(account);
        if(result.isValid()){
            RxCountDown.countdown(DEFAULT_COUNT_DOWN_TIME).doOnSubscribe(disposable -> {
                view.countDownCallBack(false,0);
            }).subscribe(integer -> view.countDownCallBack(false, integer),throwable -> Log.e("picher",throwable.getMessage()),
                    () -> view.countDownCallBack(true,0));
        }else{
            view.toast(result.getErrorMsg());
        }
    }

    @Override
    public void onRegisterClick() {

    }

    @Override
    public void onForgetPwdClick() {

    }

    @Override
    public void onLoginClick() {
        LoginRequester loginRequester = new LoginRequester.Builder()
                .account(getAccount())
                .password(getPassword()).build();
        PersonalValidator.Result result = PersonalValidator.validateLogin(loginRequester);
        if(result.isValid()){
            // TODO Login request

        }else{
            view.toast(result.getErrorMsg());
        }
    }
}
