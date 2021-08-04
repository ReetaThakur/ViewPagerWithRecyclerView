package com.example.viewpagerwithrecyclerview;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class PagerAdapeter  extends FragmentStateAdapter {
    public PagerAdapeter(@NonNull  FragmentManager fragmentManager, @NonNull  Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:return new AFragment();
            case 1: return new BFragment();
            case 2:return new CFragment();
        }
        return null;
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
