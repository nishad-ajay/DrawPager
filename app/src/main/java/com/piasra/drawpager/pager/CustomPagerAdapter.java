package com.piasra.drawpager.pager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.piasra.drawpager.fragment.FragmentA;
import com.piasra.drawpager.fragment.FragmentB;

/**
 * Created by admin on 8/25/2015.
 */
public class CustomPagerAdapter extends FragmentStatePagerAdapter {

    public CustomPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        Fragment fragment = null;

        switch (position) {
            case 0:
                fragment = new FragmentA();
                break;

            case 1:
                fragment = new FragmentB();
                break;
        }


        return fragment;
    }

    @Override
    public int getCount() {
        return 2;
    }
}
