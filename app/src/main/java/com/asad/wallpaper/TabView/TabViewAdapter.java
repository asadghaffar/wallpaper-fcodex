package com.asad.wallpaper.TabView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.asad.wallpaper.Fragments.CategoryFragment;
import com.asad.wallpaper.Fragments.HomeFragment;

public class TabViewAdapter extends FragmentPagerAdapter {

    public TabViewAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new HomeFragment();
        } else if (position == 1) {
            return new CategoryFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 2;
    }

    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return "Home";
        } else
            if (position == 1) {
            return "Category";
        } else
            return "";

    }

}
