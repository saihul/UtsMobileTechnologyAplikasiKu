package com.example.aplikasiku.adapter;


import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.aplikasiku.fragment.TabData;
import com.example.aplikasiku.fragment.TabHubungi;
import com.example.aplikasiku.fragment.TabMenu;


public class FragmentAdapter extends FragmentStateAdapter {

    public FragmentAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 1:
                return new TabData();
            case 2:
                return new TabHubungi();
        }
        return new TabMenu();
    }

    @Override
    public int getItemCount() {

        return 3;
    }
}
