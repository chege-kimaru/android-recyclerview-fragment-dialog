package com.kevin.recyclerviewfragmentdialog;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TabLayout mTabLayout;
    private ViewPager mViewPager;
    private ViewPageAdapter mViewPageAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTabLayout = (TabLayout)findViewById(R.id.tablayout_id);
        mViewPager = (ViewPager)findViewById(R.id.viewpager_id);

        mViewPageAdapter = new ViewPageAdapter(getSupportFragmentManager());
        mViewPageAdapter.adFragment(new FragmentCall(), "");
        mViewPageAdapter.adFragment(new FragmentContact(), "");
        mViewPageAdapter.adFragment(new FragmentFav(), "");

        mViewPager.setAdapter(mViewPageAdapter);
        mTabLayout.setupWithViewPager(mViewPager);


        mTabLayout.getTabAt(0).setIcon(R.drawable.ic_call_black_24dp);
        mTabLayout.getTabAt(1).setIcon(R.drawable.ic_group_black_24dp);
        mTabLayout.getTabAt(2).setIcon(R.drawable.ic_star_black_24dp);

        //To remove shadow from the actionbar
        ActionBar actionBar = getSupportActionBar();
        actionBar.setElevation(0);
    }
}
