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
 * This is the fragments that lists the most important Monuments in Bucharest
 */

public class MonumentsFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.info_list, container, false);

        //Create the list of information that will be displayed on the fragment
        final ArrayList<Info> list = new ArrayList<Info>();

        list.add(new Info(R.drawable.mr, R.string.monumentsDesc_1, R.string.monumentsAdd_1, R.string.monumentsName_1));
        list.add(new Info(R.drawable.arc, R.string.monumentsDesc_2, R.string.monumentsAdd_2, R.string.monumentsName_2));
        list.add(new Info(R.drawable.carol, R.string.monumentsDesc_3, R.string.monumentsAdd_3, R.string.monumentsName_3));
        list.add(new Info(R.drawable.cant, R.string.monumentsDesc_4, R.string.monumentsAdd_4, R.string.monumentsName_4));
        list.add(new Info(R.drawable.pj, R.string.monumentsDesc_5, R.string.monumentsAdd_5, R.string.monumentsName_5));
        list.add(new Info(R.drawable.pp, R.string.monumentsDesc_6, R.string.monumentsAdd_6, R.string.monumentsName_6));
        list.add(new Info(R.drawable.ar, R.string.monumentsDesc_7, R.string.monumentsAdd_7, R.string.monumentsName_7));


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
