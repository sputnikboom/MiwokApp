package com.example.android.miwok;

import android.content.Context;

public class Word {

    // Miwok translation of the word
    private String mMiwokTranslation;

    // default translation of the word
    private String mDefaultTranslation;

    // constructor
    public Word(String defaultTranslation, String miwokTranslation) {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
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

}