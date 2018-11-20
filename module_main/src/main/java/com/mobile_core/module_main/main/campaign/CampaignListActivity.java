package com.mobile_core.module_main.main.campaign;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.mobile_core.base.manager.router.RouterManager;
import com.mobile_core.base.mvvm.MActivity;
import com.mobile_core.base.utils.Lg;
import com.mobile_core.module_main.R;
import com.mobile_core.module_main.databinding.ActivityCampaignListBinding;
import com.mobile_core.module_main.main.helper.PagerChangeListener;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.Observable;
import io.reactivex.functions.Function;

@Route(path = RouterManager.MODEL_CAMPAIGN_LIST_ACTIVITY)
public class CampaignListActivity extends MActivity<CampaignViewModel, ActivityCampaignListBinding>
        implements CampaignContract.View {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toolbar toolbar = findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ActionBarDrawerToggle drawerToggle = new ActionBarDrawerToggle(this, binding.mainDrawer, binding.toolBar,
                R.string.open_drawer_content_desc, R.string.close_drawer_content_desc);
        drawerToggle.syncState();
        binding.mainDrawer.addDrawerListener(drawerToggle);
        binding.fab.setOnClickListener(v -> viewModel.onFabClick());
    }

    @Override
    protected CampaignViewModel onCreateViewModel() {
        return new CampaignViewModel();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_campaign_list;
    }

    @Override
    public void showTabList(List<String> mTabs) {
        Observable.fromIterable(mTabs).map((Function<String, Fragment>) CampaignListFragment::newInstance).toList()
                .map(fragments -> CampaignFragmentAdapter.newInstance(getSupportFragmentManager(), fragments, mTabs))
                .subscribe(mFragmentAdapter -> binding.viewpager.setAdapter(mFragmentAdapter));
        binding.tabLayout.setupWithViewPager(binding.viewpager);
        binding.viewpager.addOnPageChangeListener(PagerChangeListener.newInstance(binding.collapsingToolbar,binding.toolbarIvTarget,binding.toolbarIvOutgoing ));
    }
}
