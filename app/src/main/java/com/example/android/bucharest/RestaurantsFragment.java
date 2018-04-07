package com.example.android.bucharest;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * This is the fragment that lists the most important Restaurant in Bucharest
 */

public class RestaurantsFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.info_list, container, false);

        //Create the list of information that will be displayed on the fragment
        final ArrayList<Info> list = new ArrayList<Info>();

        list.add(new Info(R.drawable.artist, R.string.restaurantsDesc_1, R.string.restaurantsAdd_1, R.string.restaurantsName_1));
        list.add(new Info(R.drawable.jw, R.string.restaurantsDesc_2, R.string.restaurantsAdd_2, R.string.restaurantsName_2));
        list.add(new Info(R.drawable.pss, R.string.restaurantsDesc_2, R.string.restaurantsAdd_3, R.string.restaurantsName_3));
        list.add(new Info(R.drawable.mo, R.string.restaurantsDesc_2, R.string.restaurantsAdd_4, R.string.restaurantsName_4));
        list.add(new Info(R.drawable.iso, R.string.restaurantsDesc_2, R.string.restaurantsAdd_5, R.string.restaurantsName_5));

        // Create an {@link InfoAdapter}, whose data source is a list of {@link Info}s. The
        // adapter knows how to create list items for each item in the list.
        InfoAdapter adapter = new InfoAdapter(getActivity(), list, R.color.colorAccent);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // info_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link InfoAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Info} in the list.
        listView.setAdapter(adapter);

        return rootView;

    }
}
