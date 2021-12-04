package com.basic.miwok;

import java.util.ArrayList;

/**
 * Stores app data for all categories.
 */
public final class WordData {

    private WordData() {
    }

    /**
     * Provides all data based about app based on language category.
     *
     * @param category is the type of word list.
     *                 1 - Numbers
     *                 2 - Family Member
     *                 3 - Colors
     *                 4 - Phrases
     * @return an ArrayList containing {@link Word} of specific category. Returns null for invalid
     * category.
     */
    public static ArrayList<Word> getLanguageCategory(int category) {
        switch (category) {
            case 1:
                // Returning the list of Words from "Numbers" category.
                ArrayList<Word> numbers = new ArrayList<>();
                numbers.add(new Word(R.string.number_one, R.string.miwok_number_one,
                        R.drawable.number_one, R.raw.number_one));
                numbers.add(new Word(R.string.number_two, R.string.miwok_number_two,
                        R.drawable.number_two, R.raw.number_two));
                numbers.add(new Word(R.string.number_three, R.string.miwok_number_three,
                        R.drawable.number_three, R.raw.number_three));
                numbers.add(new Word(R.string.number_four, R.string.miwok_number_four,
                        R.drawable.number_four, R.raw.number_four));
                numbers.add(new Word(R.string.number_five, R.string.miwok_number_five,
                        R.drawable.number_five, R.raw.number_five));
                numbers.add(new Word(R.string.number_six, R.string.miwok_number_six,
                        R.drawable.number_six, R.raw.number_six));
                numbers.add(new Word(R.string.number_seven, R.string.miwok_number_seven,
                        R.drawable.number_seven, R.raw.number_seven));
                numbers.add(new Word(R.string.number_eight, R.string.miwok_number_eight,
                        R.drawable.number_eight, R.raw.number_eight));
                numbers.add(new Word(R.string.number_nine, R.string.miwok_number_nine,
                        R.drawable.number_nine, R.raw.number_nine));
                numbers.add(new Word(R.string.number_ten, R.string.miwok_number_ten,
                        R.drawable.number_ten, R.raw.number_ten));
                return numbers;

            case 2:
                // Returning the list of Words from "Family Members" category.
                ArrayList<Word> family = new ArrayList<>();
                family.add(new Word(R.string.family_father, R.string.miwok_family_father,
                        R.drawable.family_father, R.raw.family_father));
                family.add(new Word(R.string.family_mother, R.string.miwok_family_mother,
                        R.drawable.family_mother, R.raw.family_mother));
                family.add(new Word(R.string.family_son, R.string.miwok_family_son,
                        R.drawable.family_son, R.raw.family_son));
                family.add(new Word(R.string.family_daughter, R.string.miwok_family_daughter,
                        R.drawable.family_daughter, R.raw.family_daughter));
                family.add(new Word(R.string.family_older_brother, R.string.miwok_family_older_brother,
                        R.drawable.family_older_brother, R.raw.family_older_brother));
                family.add(new Word(R.string.family_younger_brother, R.string.miwok_family_younger_brother,
                        R.drawable.family_younger_brother, R.raw.family_younger_brother));
                family.add(new Word(R.string.family_older_sister, R.string.miwok_family_older_sister,
                        R.drawable.family_older_sister, R.raw.family_older_sister));
                family.add(new Word(R.string.family_younger_sister, R.string.miwok_family_younger_sister,
                        R.drawable.family_younger_sister, R.raw.family_younger_sister));
                family.add(new Word(R.string.family_grandmother, R.string.miwok_family_grandmother,
                        R.drawable.family_grandmother, R.raw.family_grandmother));
                family.add(new Word(R.string.family_grandfather, R.string.miwok_family_grandfather,
                        R.drawable.family_grandfather, R.raw.family_grandfather));
                return family;

            case 3:
                // Returning the list of Words from "Colors" category.
                ArrayList<Word> colors = new ArrayList<>();
                colors.add(new Word(R.string.color_red, R.string.miwok_color_red,
                        R.drawable.color_red, R.raw.color_red));
                colors.add(new Word(R.string.color_mustard_yellow, R.string.miwok_color_mustard_yellow,
                        R.drawable.color_mustard_yellow, R.raw.color_mustard_yellow));
                colors.add(new Word(R.string.color_dusty_yellow, R.string.miwok_color_dusty_yellow,
                        R.drawable.color_dusty_yellow, R.raw.color_dusty_yellow));
                colors.add(new Word(R.string.color_green, R.string.miwok_color_green,
                        R.drawable.color_green, R.raw.color_green));
                colors.add(new Word(R.string.color_brown, R.string.miwok_color_brown,
                        R.drawable.color_brown, R.raw.color_brown));
                colors.add(new Word(R.string.color_gray, R.string.miwok_color_gray,
                        R.drawable.color_gray, R.raw.color_gray));
                colors.add(new Word(R.string.color_black, R.string.miwok_color_black,
                        R.drawable.color_black, R.raw.color_black));
                colors.add(new Word(R.string.color_white, R.string.miwok_color_white,
                        R.drawable.color_white, R.raw.color_white));
                return colors;

            case 4:
                // Returning the list of Words from "Phrases" category.
                ArrayList<Word> phrases = new ArrayList<>();
                phrases.add(new Word(R.string.phrase_where_are_you_going,
                        R.string.miwok_phrase_where_are_you_going, R.raw.phrase_where_are_you_going));
                phrases.add(new Word(R.string.phrase_what_is_your_name,
                        R.string.miwok_phrase_what_is_your_name, R.raw.phrase_what_is_your_name));
                phrases.add(new Word(R.string.phrase_my_name_is,
                        R.string.miwok_phrase_my_name_is, R.raw.phrase_my_name_is));
                phrases.add(new Word(R.string.phrase_how_are_you_feeling,
                        R.string.miwok_phrase_how_are_you_feeling, R.raw.phrase_how_are_you_feeling));
                phrases.add(new Word(R.string.phrase_im_feeling_good,
                        R.string.miwok_phrase_im_feeling_good, R.raw.phrase_im_feeling_good));
                phrases.add(new Word(R.string.phrase_are_you_coming,
                        R.string.miwok_phrase_are_you_coming, R.raw.phrase_are_you_coming));
                phrases.add(new Word(R.string.phrase_yes_im_coming,
                        R.string.miwok_phrase_yes_im_coming, R.raw.phrase_yes_im_coming));
                phrases.add(new Word(R.string.phrase_im_coming,
                        R.string.miwok_phrase_im_coming, R.raw.phrase_im_coming));
                phrases.add(new Word(R.string.phrase_lets_go,
                        R.string.miwok_phrase_lets_go, R.raw.phrase_lets_go));
                phrases.add(new Word(R.string.phrase_come_here,
                        R.string.miwok_phrase_come_here, R.raw.phrase_come_here));
                return phrases;

            default:
                return null;
        }
    }
}