package com.esamdevelopers.gamej.crafterapp.adaptador;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.esamdevelopers.gamej.crafterapp.BaseFragment;

/**
 * Created by gamej on 5/1/2017.
 */

public class BaseViewPagerAdapter extends FragmentStatePagerAdapter {

    private String[] tabs;
    private String[] descriptions;

    public BaseViewPagerAdapter(FragmentManager manager, String[] tabs, String[] descriptions) {
        super(manager);
        this.tabs = tabs;
        this.descriptions = descriptions;
    }

    @Override
    public Fragment getItem(int position) {
        return BaseFragment.getInstance(tabs[position], descriptions[position]);
    }

    @Override
    public int getCount() {
        return tabs.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabs[position];
    }
}