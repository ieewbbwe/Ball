package com.mobile_core.module_main.main;

import android.os.Bundle;

import com.mobile_core.base.mvvm.MActivity;
import com.mobile_core.base.mvvm.ParentViewModel;
import com.mobile_core.module_main.R;

public class HomeActivity extends MActivity implements HomeContract.View{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected ParentViewModel onCreateViewModel() {
        return new HomeViewModel();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_home;
    }
}
