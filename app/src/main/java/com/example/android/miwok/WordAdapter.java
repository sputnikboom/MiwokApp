package com.example.android.miwok;

import android.app.Activity;
import android.media.Image;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    /** Resouce iD for the background color for this list of words */
    private int mColorResourceId;

    /**
     * custom constructor
     * @param context
     * @param words
     */

    public WordAdapter(Activity context, ArrayList<Word> words, int colorResourceId) {
        super(context, 0, words);
        mColorResourceId = colorResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // checks if the existing view is being reused, otherwise inflates the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        // gets the Word object located at this position
        Word currentWord = getItem(position);

        // finds the TextView in the list_item.xml layout with the id miwok_text_view
        TextView miwokWordTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        // Get the miwok translation from the current Word object and
        // sets this text on the miwok_text_view TextView
        miwokWordTextView.setText(currentWord.getMiwokTranslation());

        // finds the TextView in the list_item.xml layout with the id default_text_view
        TextView defaultWordTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        // get the default translation from the current Word object and
        // sets this text on the default_text_view TextView
        defaultWordTextView.setText(currentWord.getDefaultTranslation());

        // finds the ImageView in the list_item.xml layout with the id word_image
        ImageView wordImageView = (ImageView) listItemView.findViewById(R.id.word_image);

        // checks if an image has been provided for word
        if (currentWord.hasImage()) {
            wordImageView.setImageResource(currentWord.getImageResourceId());
            wordImageView.setVisibility(View.VISIBLE);
        } else {
            wordImageView.setVisibility(View.GONE);
        }

        //finds the LinearLayout in the list_item.xml layout file
        View textContainer = listItemView.findViewById(R.id.text_container);

        //finds the color that the resourse ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);

        // set the background color of the view
        textContainer.setBackgroundColor(color);

        //Return the whole list item layout (containing 2 TextViews and 1 ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
