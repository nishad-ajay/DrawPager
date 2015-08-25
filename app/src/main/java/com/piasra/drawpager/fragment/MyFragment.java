package com.piasra.drawpager.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.piasra.drawpager.R;

/**
 * Created by admin on 8/24/2015.
 */
public class MyFragment extends Fragment {

    TextView tvFragmentNumber;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_my, container, false);
        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        Bundle b = getArguments();

        int fragmentNumber = b.getInt("fragment_number");

        tvFragmentNumber = (TextView) getActivity().findViewById(R.id.tvFragmentNumber);

        tvFragmentNumber.setText("Fragment: " + (fragmentNumber + 1));

    }
}
