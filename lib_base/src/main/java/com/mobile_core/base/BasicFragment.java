package com.mobile_core.base;

import android.annotation.SuppressLint;
import android.support.annotation.StringRes;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.mobile_core.base.fragment.LoadingDialogFragment;
import com.mobile_core.base.mvvm.MActivity;

/**
 * Created by picher on 2018/7/5.
 * Describe：
 */

public abstract class BasicFragment extends Fragment implements BasicView{

    private static final String LOADING_DIALOG_TAG = "loading_dialog_tag";
    private Toast toast;

    @Override
    public void showLoadingDialog(boolean show) {
        if(getActivity() != null){
            Fragment loadingDialog = getActivity().getSupportFragmentManager().findFragmentByTag(LOADING_DIALOG_TAG);
            if(show){
                if(loadingDialog == null){
                    new LoadingDialogFragment().show(getActivity().getSupportFragmentManager(),LOADING_DIALOG_TAG);
                }
            }else{
                if(loadingDialog != null && loadingDialog instanceof DialogFragment) {
                    ((DialogFragment) loadingDialog).dismiss();
                }
            }
        }
    }

    @Override
    public void showErrorDialog(String error) {
        if(getActivity() instanceof MActivity){
            ((MActivity) getActivity()).toast(error);
        }
    }

    @Override
    public boolean isCanShowDialog() {
        return false;
    }

    @Override
    public AppCompatActivity getSupportActivity() {
        return (AppCompatActivity) getActivity();
    }

    @SuppressLint("ShowToast")
    @Override
    public void toast(String str) {
        if (toast == null) {
            toast = Toast.makeText(getActivity(), str, Toast.LENGTH_SHORT);
        } else {
            toast.setText(str);
            toast.setDuration(Toast.LENGTH_SHORT);
        }
        toast.show();
    }

    @SuppressLint("ShowToast")
    public void toast(@StringRes int strInt) {
        if(getActivity() != null){
            if (toast == null) {
                toast = Toast.makeText(getActivity(), getActivity().getResources().getString(strInt), Toast.LENGTH_SHORT);
            } else {
                toast.setText( getResources().getString(strInt));
                toast.setDuration(Toast.LENGTH_SHORT);
            }
            toast.show();
        }
    }
}
