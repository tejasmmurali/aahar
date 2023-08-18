package com.example.ahar.Adaptar;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;
/**
 * Created by Istiak Saif on 14/03/21.
 */
public class TabViewPagerAdapter extends FragmentStatePagerAdapter {
    private final List<Fragment>fragmentList = new ArrayList<>();
    private final List<String> FragmentListTitles = new ArrayList<>();

    public TabViewPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return FragmentListTitles.size();
    }

    public CharSequence getPageTitle(int position){
        return FragmentListTitles.get(position);
    }
    public void AddFragment(Fragment fragment, String Title){
        fragmentList.add(fragment);
        FragmentListTitles.add(Title);

    }
//    public int getItemPosition(Object object) {
//        return POSITION_NONE;
//    }
}
