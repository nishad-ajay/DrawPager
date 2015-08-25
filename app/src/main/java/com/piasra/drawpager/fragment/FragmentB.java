package com.piasra.drawpager.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.piasra.drawpager.R;

/**
 * Created by admin on 8/25/2015.
 */
public class FragmentB extends Fragment {
    private static final String TAG = FragmentB.class.getSimpleName();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.v(TAG, "Fragment B replaced");
        return inflater.inflate(R.layout.fragment_b, container, false);
    }
}