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

    // ID for the word's audio file
    private int mAudioResourceId;

    // constructor for phrases activites
    public Word(String defaultTranslation, String miwokTranslation, int audioResourceID) {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
        mAudioResourceId = audioResourceID;
    }

    // constructor for color, family, numbers activites
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceID, int audioResourceId) {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
        mImageResourceID = imageResourceID;
        mAudioResourceId = audioResourceId;
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

    /**
     * Get the ID of the audio file for the word
     */
    public int getAudioResourceId() {
        return mAudioResourceId ; }
    }



