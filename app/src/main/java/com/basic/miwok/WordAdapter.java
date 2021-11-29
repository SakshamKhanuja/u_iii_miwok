package com.basic.miwok;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

/**
 * Provides Views which are inflated from {@link R.layout#layout_item_word} to ListViews each
 * word category Activity.
 */
public class WordAdapter extends ArrayAdapter<Word> {

    /**
     * Initializes a custom ArrayAdapter that shows a list of Word. Each View is inflated from
     * {@link R.layout#layout_item_word}.
     *
     * @param context is the current Context.
     * @param words   is the list of Word to display.
     */
    public WordAdapter(Context context, ArrayList<Word> words) {
        super(context, 0, words);
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

        // Getting the Word based on "position".
        Word currentlyViewedWord = getItem(position);

        // Setting values to "itemView" from "currentlyViewedWord".
        if (currentlyViewedWord != null) {
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