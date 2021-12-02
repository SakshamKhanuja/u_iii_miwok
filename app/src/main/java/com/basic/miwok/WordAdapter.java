package com.basic.miwok;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.content.res.AppCompatResources;

import java.util.ArrayList;

/**
 * Provides Views which are inflated from {@link R.layout#layout_item_word} to ListViews each
 * word category Activity.
 */
public class WordAdapter extends ArrayAdapter<Word> {

    private final int mBackgroundColorID;

    /**
     * Initializes a custom ArrayAdapter that shows a list of Word. Each View is inflated from
     * {@link R.layout#layout_item_word}.
     *
     * @param context is the current Context.
     * @param words   is the list of Word to display.
     */
    public WordAdapter(Context context, ArrayList<Word> words, int wordBackgroundColorID) {
        super(context, 0, words);
        mBackgroundColorID = wordBackgroundColorID;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Getting the recycled View.
        View itemView = convertView;

        // Checks if inflating the View is required.
        if (itemView == null) {
            LayoutInflater layoutInflater = (LayoutInflater) getContext().getSystemService(
                    Context.LAYOUT_INFLATER_SERVICE);
            itemView = layoutInflater.inflate(R.layout.layout_item_word, parent, false);
        }

        // Set background color for Word container layout.
        LinearLayout layoutContainer = itemView.findViewById(R.id.layout_container);
        layoutContainer.setBackground(AppCompatResources.getDrawable(getContext(),
                mBackgroundColorID));

        // Getting the Word based on "position".
        Word currentlyViewedWord = getItem(position);

        // Setting values to "itemView" from "currentlyViewedWord".
        if (currentlyViewedWord != null) {

            // Set Miwok Drawable.
            ImageView imageMiwok = itemView.findViewById(R.id.image_view_word);
            // Checks if current Word category is not "Phrases".
            if (currentlyViewedWord.isWordNotPhrase()) {
                imageMiwok.setImageDrawable(AppCompatResources.getDrawable(getContext(),
                        currentlyViewedWord.getImageResourceID()));
                imageMiwok.setVisibility(View.VISIBLE);
            } else {
                imageMiwok.setVisibility(View.GONE);
            }

            // Set Miwok Translation.
            TextView miwokTextView = itemView.findViewById(R.id.text_view_item_miwok);
            miwokTextView.setText(currentlyViewedWord.getMiwokTranslation());

            // Set Default Translation.
            TextView defaultTextView = itemView.findViewById(R.id.text_view_item_default);
            defaultTextView.setText(currentlyViewedWord.getDefaultTranslation());
        }
        return itemView;
    }
}