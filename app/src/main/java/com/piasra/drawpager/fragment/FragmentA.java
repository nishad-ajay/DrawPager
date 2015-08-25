package com.piasra.drawpager.fragment;


import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ListFragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;

import com.piasra.drawpager.MainActivity;
import com.piasra.drawpager.R;

/**
 * Created by admin on 8/25/2015.
 */
public class FragmentA extends ListFragment {

    private static final String TAG = FragmentA.class.getSimpleName();

    private MainActivity activity;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.v(TAG, "Fragment A replaced");
        View v = inflater.inflate(R.layout.fragment_a, container, false);

        Button bLoadList = (Button) v.findViewById(R.id.bLoadList);

        bLoadList.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                populateListView();
            }
        });
        return v;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);

        this.activity = (MainActivity) activity;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
//        populateListView();
    }

    public void populateListView() {
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(activity.getApplicationContext(), android.R.layout.simple_expandable_list_item_1, new String[]{"Mango", "Banana", "Papaya"});
        getListView().setAdapter(arrayAdapter);
    }
}
