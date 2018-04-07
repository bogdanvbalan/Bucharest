package com.example.android.bucharest;

import android.content.Context;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by User6 on 05/04/2018.
 */

public class CategoryAdapter extends FragmentPagerAdapter {
    private Context mContext;

    public CategoryAdapter(Context context, FragmentManager fm){
        super(fm);
        mContext = context;
    }

    @Override
    public android.support.v4.app.Fragment getItem(int position) {
        if (position==0) return new HomeFragment();
        if(position==1) return new MuseumsFragment();
        else if (position==2) return new MonumentsFragment();
        else if(position==3) return new ParksFragment();
        else return new RestaurantsFragment();
    }

    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if(position == 0) return mContext.getString(R.string.firstTab);
        else if (position == 1) return mContext.getString(R.string.secondTab);
        else if (position == 2) return mContext.getString(R.string.thirdTab);
        else if (position == 3) return mContext.getString(R.string.fourthTab);
        else return mContext.getString(R.string.fifthTab);
    }
}
