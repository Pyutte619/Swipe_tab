package com.example.piyut.swipetab;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by piyut on 10/03/2015.
 */
public class MyAdapter extends FragmentPagerAdapter {

    public MyAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        Fragment frag=null;
        if(i==0){
            frag= new FragmentA();
        }
        if(i==1){
            frag=new FragmentB();
        }
        return frag;
    }

    @Override
    public int getCount() {
        return 2;
    }
}
