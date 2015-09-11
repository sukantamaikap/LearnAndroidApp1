package com.example.smaikap.realapp;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {

    private List<String> _newsList = new ArrayList<String>();


    public MainFragment () {
        // Required empty public constructor
    }


    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container,
                              Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View fragmentView = inflater.inflate(R.layout.fragment_news, container, false);
        ListView newsListView = fragmentView.findViewById(R);

        _newsList.add("Sukanta Maikap's startup valued at 1.2 Billion by Siquiro");
        _newsList.add("Sukanta earns a Phd in computer scinece");
        return fragmentView;
    }


}
