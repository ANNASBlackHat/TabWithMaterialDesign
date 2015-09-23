package com.dicoding.annasblackhat.materialtab.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.dicoding.annasblackhat.materialtab.fragment.Tab1Fragment;
import com.dicoding.annasblackhat.materialtab.fragment.Tab2Fragment;


/**
 * Created by annasblackhat on 9/23/15.
 */
public class TabFragmentPagerAdapter extends FragmentPagerAdapter {

    //nama tab nya
    String[] title = new String[]{
            "Tab 1", "Tab 2"
    };

    public TabFragmentPagerAdapter(FragmentManager fm){
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment=null;
        switch (position){
            case 0 :
                fragment = new Tab1Fragment();
                break;
            case 1:
                fragment = new Tab2Fragment();
                break;
            default:
                fragment = null;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return title.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return title[position];
    }
}
