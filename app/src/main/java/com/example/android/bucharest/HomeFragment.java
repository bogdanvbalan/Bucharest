package com.example.android.bucharest;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * This is the fragments that lists the most important Monuments in Bucharest
 */

public class HomeFragment extends Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.home_layout, container, false);

        //Sets the coat of arms picture
        ImageView coat_of_arms = (ImageView) rootView.findViewById(R.id.coat_of_arms);
        coat_of_arms.setImageResource(R.drawable.buc_coat_of_arms);

//Sets the text on the header
        TextView header_text = rootView.findViewById(R.id.header_text);
        header_text.setText(R.string.headerText);

//Sets the text on the first paragraph
        TextView first_par = rootView.findViewById(R.id.first_par);
        first_par.setText(R.string.firstPar);


//Sets the text on the second paragraph
        TextView second_par = rootView.findViewById(R.id.second_par);
        second_par.setText(R.string.secondPar);


//Sets the text on the third paragraph
        TextView third_par = rootView.findViewById(R.id.third_par);
        third_par.setText(R.string.thirdPar);

//Sets the text on the fourth paragraph
        TextView fourth_par = rootView.findViewById(R.id.fourth_par);
        fourth_par.setText(R.string.fourthPar);

//Sets the text on the fifth paragraph
        TextView fifth_par = rootView.findViewById(R.id.fifth_par);
        fifth_par.setText(R.string.fifthPar);

        //Set the background
        ScrollView bg = (ScrollView) rootView.findViewById(R.id.home_container);
        int color = ContextCompat.getColor(getContext(), R.color.colorAccent);
        bg.setBackgroundColor(color);

        return rootView;


    }
}
