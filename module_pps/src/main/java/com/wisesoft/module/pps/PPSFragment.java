package com.wisesoft.module.pps;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.mobile_core.base.manager.router.RouterManager;
import com.mobile_core.base.mvvm.MFragment;
import com.mobile_core.base.mvvm.ParentViewModel;
import com.wisesoft.module.pps.databinding.FragmnetPpsBinding;

/**
 * Created by picher on 2018/7/20.
 * Describe：
 */

@Route(path = RouterManager.MODEL_PPS_MAIN_FRAGMENT)
public class PPSFragment extends MFragment<PPSViewModel,FragmnetPpsBinding> {
    @Override
    protected PPSViewModel onCreateViewModel() {
        return new PPSViewModel();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragmnet_pps;
    }
}
