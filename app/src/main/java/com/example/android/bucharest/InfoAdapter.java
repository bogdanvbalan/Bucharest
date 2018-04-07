package com.example.android.bucharest;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class InfoAdapter extends ArrayAdapter<Info> {

    //Resource ID for the background color
    private int mColorResourceId;

    //The constructor
    public InfoAdapter(Context context, ArrayList<Info> info, int colorResourceId) {
        super(context, 0, info);
        mColorResourceId = colorResourceId;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Info} object located at this position in the list
        Info currentItem = getItem(position);

        //Find the ImageView in the list_item.xml layout
        ImageView image = (ImageView) listItemView.findViewById(R.id.list_image);
        //Check if an image was provided
        if (currentItem.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            image.setImageResource(currentItem.getImage());
            // Make sure the view is visible
            image.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            image.setVisibility(View.GONE);
        }

        //Find the description view in the layout
        TextView description = (TextView) listItemView.findViewById(R.id.list_desc);
        //Set the description
        description.setText(currentItem.getDescription());

        //Find the contact view in the layout
        TextView contact = (TextView) listItemView.findViewById(R.id.list_contact);
        //Set the contact
        contact.setText(currentItem.getContact());

        //Find the name view in the layout
        TextView name = (TextView) listItemView.findViewById(R.id.list_name);
        //Set the contact
        name.setText(currentItem.getName());

        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.list_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing 2 TextViews and on ImageView) so that it can be shown in
        // the ListView.
        return listItemView;

    }
}
