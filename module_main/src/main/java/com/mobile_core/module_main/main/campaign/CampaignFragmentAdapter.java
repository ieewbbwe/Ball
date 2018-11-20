package com.mobile_core.module_main.main.campaign;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.mobile_core.module_main.main.Constants;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by picher on 2018/7/27.
 * Describe：
 */

public class CampaignFragmentAdapter extends FragmentStatePagerAdapter {

    private List<String> titles;
    private List<Fragment> fragments;

    public static CampaignFragmentAdapter newInstance(FragmentManager fm, List<Fragment> fragments, List<String> titles) {
        CampaignFragmentAdapter adapter = new CampaignFragmentAdapter(fm);
        adapter.fragments = fragments;
        adapter.titles = titles;
        return adapter;
    }

    public CampaignFragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return fragments == null? null:fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments == null ? 0 : fragments.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return titles.get(position);
    }
}
