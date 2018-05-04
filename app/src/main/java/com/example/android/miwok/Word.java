package com.example.android.miwok;

import android.content.Context;

public class Word {

    // Miwok translation of the word
    private String mMiwokTranslation;

    // default translation of the word
    private String mDefaultTranslation;

    // ID for Drawable resource
    private int mImageResourceID = NO_IMAGE_PROVIDED;

    // const value to represent no img value provided for word
    private static final int NO_IMAGE_PROVIDED = -1;

    // constructor for phrases activity
    public Word(String defaultTranslation, String miwokTranslation) {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
    }

    // constructor for numbers, family, colors activities
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceID) {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
        mImageResourceID = imageResourceID;
    }

    /**
     * Get the default translation of the word
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the Miwok translation of the word
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    // returns if there is an image resource for this word
    public boolean hasImage() {
        return mImageResourceID != NO_IMAGE_PROVIDED;
    }

    /**
     * Get the image resource drawable ID
     */
    public int getImageResourceId() {
        return mImageResourceID ;
    }
}
