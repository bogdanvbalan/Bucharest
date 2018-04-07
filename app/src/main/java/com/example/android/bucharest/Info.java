package com.example.android.bucharest;

// The object that holds the information for each entry of the list

public class Info {

    //The value used to check if an image was provided or not
    private static final int NO_IMAGE_PROVIDED = -1;

    //The member that holds the path to the image
    private int mImage = NO_IMAGE_PROVIDED;

    //The member that holds the description of the item
    private int mDescription;

    //The member that holds contact information
    private int mContact;

    //The member that holds the name
    private int mName;

    //The constructor
    public Info(int image, int description, int contact, int name) {
        mImage = image;
        mDescription = description;
        mContact = contact;
        mName = name;
    }

    //Method to get the image
    public int getImage() {
        return mImage;
    }

    //Method to get the description
    public int getDescription() {
        return mDescription;
    }

    ;

    //Method to get the contact info
    public int getContact() {
        return mContact;
    }

    ;

    //Return true if an image was provided
    public boolean hasImage() {
        return mImage != NO_IMAGE_PROVIDED;
    }

    //Method to get the name
    public int getName() {
        return mName;
    }
}
