package com.mobile_core.module_main.main;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.mobile_core.module_main.R;
import com.mobile_core.module_main.main.campaign.CampaignFragmentAdapter;
import com.mobile_core.module_main.main.campaign.CampaignListFragment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Route(path = "/demo/viewpager")
public class DemoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ViewPager viewPager = findViewById(R.id.viewpager);
        TabLayout tabLayout = findViewById(R.id.tab);
        List<String> tabList = Arrays.asList(Constants.HOME_TAB_LIST);
        List<Fragment> listFragments = new ArrayList<>();
        for(String tab:tabList){
            //CampaignListFragment listFragment = CampaignListFragment.newInstance(tab);
            listFragments.add(new DemoFragment());
        }
        CampaignFragmentAdapter adapter = CampaignFragmentAdapter.newInstance(getSupportFragmentManager(),listFragments,tabList);
        viewPager.setAdapter(adapter);

        tabLayout.setupWithViewPager(viewPager);
    }
}
