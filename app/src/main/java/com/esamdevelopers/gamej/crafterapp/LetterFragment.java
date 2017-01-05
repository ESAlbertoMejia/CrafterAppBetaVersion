package com.esamdevelopers.gamej.crafterapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.esamdevelopers.gamej.crafterapp.adaptador.BaseViewPagerAdapter;

/**
 * A simple {@link Fragment} subclass.
 */
public class LetterFragment extends Fragment {

    private String[] tabs = {
            "Cafés", "Crepas", "Reposteria"
    };

    private String[] descriptions = {
            "Smooties y Cafés", "Sabrosas crepas dulces y saladas", "Exquisitos pan dulces, pies y pasteles"
    };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.app_bar_with_tabs, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ViewPager viewPager = (ViewPager) view.findViewById(R.id.view_pager);
        viewPager.setAdapter(new LetterViewPagerAdapter(getActivity().getSupportFragmentManager()));

        TabLayout tabLayout = (TabLayout) view.findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        if (getActivity() instanceof MainActivity){
            MainActivity activity = (MainActivity) getActivity();
            activity.onUpdateSubTitle(getString(R.string.title_nav_letter));
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        MainActivity activity = (MainActivity) getActivity();
        activity.navigationView.setCheckedItem(R.id.nav_letter);
    }

    private class LetterViewPagerAdapter extends BaseViewPagerAdapter {

        public LetterViewPagerAdapter(FragmentManager manager) {
            super(manager, tabs, descriptions);
        }
    }
}