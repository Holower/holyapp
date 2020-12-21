package com.example.holy_app;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.holy_app.fragmentos.EucaristiaFragment;
import com.example.holy_app.fragmentos.MapaFragment;
import com.example.holy_app.fragmentos.PerfilFragment;

public class PageAdapter extends FragmentPagerAdapter {
    private int numItems;
    public PageAdapter(@NonNull FragmentManager fm, int numItems) {
        super(fm);
        this.numItems = numItems;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new EucaristiaFragment();
            case 1:
                return new PerfilFragment();
            case 2:
                return new MapaFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return numItems;
    }
}
