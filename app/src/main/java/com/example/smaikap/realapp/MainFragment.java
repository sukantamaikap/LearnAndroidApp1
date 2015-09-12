package com.example.smaikap.realapp;


import android.database.DataSetObserver;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

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
        ListView newsListView = (ListView) fragmentView.findViewById(R.id.NewsListView);
        newsListView.setAdapter(new NewsAdapter());

        _newsList.add("sm Maikap's startup valued at 1.2 Billion by Siquiro");
        _newsList.add("sm earns a Phd in computer scinece");
        _newsList.add("sm publishes new ground breaking camera app");
        _newsList.add("#Personal : Sukanta buys a new row house in central Bnglore .. ");
        _newsList.add("#sm : new sensation in Indian startup scene ..");
        _newsList.add("");
        return fragmentView;
    }


    private class NewsAdapter extends BaseAdapter {


        @Override
        public int getCount () {
            return _newsList.size();
        }

        @Override
        public Object getItem (int position) {
            return _newsList.get(position);
        }

        @Override
        public long getItemId (int position) {
            return 0;
        }

        @Override
        public View getView (int position, View convertView, ViewGroup parent) {
            View rowView = getActivity().getLayoutInflater().inflate(R.layout.news,null);
            TextView textViewNews = (TextView) rowView.findViewById(R.id.textView);
            textViewNews.setText(_newsList.get(position));
            return rowView;
        }
    }


}
