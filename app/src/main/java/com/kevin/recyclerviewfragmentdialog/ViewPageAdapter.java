package com.kevin.recyclerviewfragmentdialog;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kevin Kimaru Chege on 7/avatar10/2018.
 */

public class ViewPageAdapter extends FragmentPagerAdapter {

    private final List<Fragment> listFragment = new ArrayList<>();
    private final List<String> listFragmentTitles = new ArrayList<>();

    public ViewPageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return listFragment.get(position);
    }

    @Override
    public int getCount() {
        return listFragment.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return listFragmentTitles.get(position);
    }

    public void adFragment(Fragment fragment, String title) {
        listFragment.add(fragment);
        listFragmentTitles.add(title);
    }
}
