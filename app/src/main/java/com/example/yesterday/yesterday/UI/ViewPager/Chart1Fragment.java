package com.example.yesterday.yesterday.UI.ViewPager;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.yesterday.yesterday.R;

public class Chart1Fragment extends Fragment {

    private ViewGroup rootView;

    public Chart1Fragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        rootView=(ViewGroup)inflater.inflate(R.layout.fragment_chart1,container,false);

        // Inflate the layout for this fragment
        return rootView;
    }
}
