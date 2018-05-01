package com.example.android.miwok;

import android.content.Context;

public class Word {

    // Miwok translation of the word
    private String mMiwokTranslation;

    // default translation of the word
    private String mDefaultTranslation;

    // ID for Drawable resource
    private int mImageResourceID;

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

    /**
     * Get the image resource drawable ID
     */
    public int getImageResourceID() {
        return mImageResourceID ;
    }
}
