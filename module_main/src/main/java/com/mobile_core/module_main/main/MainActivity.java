package com.mobile_core.module_main.main;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.mobile_core.base.mvvm.MActivity;
import com.mobile_core.base.mvvm.ToolBarViewModel;
import com.mobile_core.module_main.R;
import com.mobile_core.module_main.databinding.ActivityMMainBinding;
/**
 * Created by picher on 2018/7/5.
 * Describe：MVVM
 */

public class MainActivity extends MActivity<MainViewModel, ActivityMMainBinding>
        implements MainContract.View {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ToolBarViewModel toolBarViewModel = new ToolBarViewModel.Builder().setTitle("测试").build();
        setupToolBar(toolBarViewModel,findViewById(R.id.toolBarLayout));
        toolBarViewModel.onAttach(this);
        binding.setToolBarViewModel(toolBarViewModel);

        //viewModel.requestPermission();
    }

    @Override
    protected MainViewModel onCreateViewModel() {
        return new MainViewModel();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_m_main;
    }

}
