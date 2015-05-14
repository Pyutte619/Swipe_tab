package com.example.piyut.swipetab;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by piyut on 10/03/2015.
 */
public class FragmentA extends android.support.v4.app.Fragment {
    ListView listA;
    String[] events,deskrip;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_a,container,false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        Resources res=getResources();
        events=res.getStringArray(R.array.events);
        deskrip=res.getStringArray(R.array.deskripsi);
        listA= (ListView) getActivity().findViewById(R.id.listView);
        MyListAdapter adapter;
    }

    class MyListAdapter extends ArrayAdapter<String>{
        Context context;
        String[] titles;
        public MyListAdapter(Context context, int resource,String[] titles) {
            super(context, resource);
            this.context=context;
            this.titles=titles;
        }
    }
}
