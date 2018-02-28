package com.example.entec01.myapplication;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.Log;

/**
 * Created by Entec01 on 2/21/2018.
 */

public class ArtFragmentPagerAdapter extends FragmentPagerAdapter {
    private static final String TAG = "ArtFragmentPagerAdapter";

    public ArtFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch(position){
            case 0:
                Fragment frag1 = new GalleryFragment();
                return frag1;
            case 1:
                Fragment frag2 = new QuizFragment();
                return frag2;
            case 2:
                Fragment frag3 = new MapFragment();
                return frag3;
            default:
                Log.e(TAG, "This tab does not exist");
                return null;
        }

    }

    @Override
    public int getCount() {
        return 3;
    }
}
