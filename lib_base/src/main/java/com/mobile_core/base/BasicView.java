package com.mobile_core.base;

import android.support.annotation.IntegerRes;
import android.support.annotation.StringRes;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by picher on 2018/7/5.
 * Describe：MVVM View
 */

public interface BasicView {

    void showLoadingDialog(boolean show);

    void showErrorDialog(String error);

    boolean isCanShowDialog();

    AppCompatActivity getSupportActivity();

    void toast(String str);

    void toast(@StringRes int strInt);

}
