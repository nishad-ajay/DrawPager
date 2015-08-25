package com.piasra.drawpager.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.piasra.drawpager.R;
import com.piasra.drawpager.pager.CustomPagerAdapter;

/**
 * Created by admin on 8/25/2015.
 */
public class PagerFragment extends Fragment {

    private FragmentManager fragmentManager;
    CustomPagerAdapter customPagerAdapter;

    ViewPager pager;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_pager, container, false);

        pager = (ViewPager) v.findViewById(R.id.pager);
        customPagerAdapter = new CustomPagerAdapter(this.getChildFragmentManager());
        pager.setAdapter(customPagerAdapter);
        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    public void setFragmentManager(FragmentManager fragmentManager) {
        this.fragmentManager = fragmentManager;
    }

    public ViewPager getPager() {
        return pager;
    }

    public CustomPagerAdapter getCustomPagerAdapter() {
        return customPagerAdapter;
    }
}
