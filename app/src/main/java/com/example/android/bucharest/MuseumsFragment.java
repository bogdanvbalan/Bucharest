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
 * This is the fragment that lists the most important museums in Bucharest
 */

public class MuseumsFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.info_list, container, false);

        //Create the list of information that will be displayed on the fragment
        final ArrayList<Info> list = new ArrayList<Info>();

        list.add(new Info(R.drawable.muzeul_satului, R.string.museumsDesc_1, R.string.museumsAdd_1, R.string.museumsName_1));
        list.add(new Info(R.drawable.muzeul_taranului, R.string.museumsDesc_2, R.string.museumsAdd_2, R.string.museumsName_2));
        list.add(new Info(R.drawable.antipa, R.string.museumsDesc_3, R.string.museumsAdd_3, R.string.museumsName_3));
        list.add(new Info(R.drawable.nmar, R.string.museumsDesc_4, R.string.museumsAdd_4, R.string.museumsName_4));
        list.add(new Info(R.drawable.cotroceni, R.string.museumsDesc_5, R.string.museumsAdd_5, R.string.museumsName_5));
        list.add(new Info(R.drawable.mnir, R.string.museumsDesc_6, R.string.museumsAdd_6, R.string.museumsName_6));
        list.add(new Info(R.drawable.genescu, R.string.museumsDesc_7, R.string.museumsAdd_7, R.string.museumsName_7));
        list.add(new Info(R.drawable.ta, R.string.museumsDesc_8, R.string.museumsAdd_8, R.string.museumsName_8));
        list.add(new Info(R.drawable.tp, R.string.museumsDesc_9, R.string.museumsAdd_9, R.string.museumsName_9));
        list.add(new Info(R.drawable.bankm, R.string.museumsDesc_10, R.string.museumsAdd_10, R.string.museumsName_10));

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
