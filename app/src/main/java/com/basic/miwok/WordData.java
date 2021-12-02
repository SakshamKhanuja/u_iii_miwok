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
                numbers.add(new Word("one", "lutti", R.drawable.number_one));
                numbers.add(new Word("two", "otiiko", R.drawable.number_two));
                numbers.add(new Word("three", "tolookosu", R.drawable.number_three));
                numbers.add(new Word("four", "oyyisa", R.drawable.number_four));
                numbers.add(new Word("five", "massokka", R.drawable.number_five));
                numbers.add(new Word("six", "temmokka", R.drawable.number_six));
                numbers.add(new Word("seven", "kenekaku", R.drawable.number_seven));
                numbers.add(new Word("eight", "kawinta", R.drawable.number_eight));
                numbers.add(new Word("nine", "wo’e", R.drawable.number_nine));
                numbers.add(new Word("ten", "na’aacha", R.drawable.number_ten));
                return numbers;

            case 2:
                // Returning the list of Words from "Family Members" category.
                ArrayList<Word> family = new ArrayList<>();
                family.add(new Word("father", "әpә", R.drawable.family_father));
                family.add(new Word("mother", "әṭa", R.drawable.family_mother));
                family.add(new Word("son", "angsi", R.drawable.family_son));
                family.add(new Word("daughter", "tune", R.drawable.family_daughter));
                family.add(new Word("older brother", "taachi", R.drawable.family_older_brother));
                family.add(new Word("younger brother", "chalitti", R.drawable.family_younger_brother));
                family.add(new Word("older sister", "teṭe", R.drawable.family_older_sister));
                family.add(new Word("younger sister", "kolliti", R.drawable.family_younger_sister));
                family.add(new Word("grandmother ", "ama", R.drawable.family_grandmother));
                family.add(new Word("grandfather", "paapa", R.drawable.family_grandfather));
                return family;

            case 3:
                // Returning the list of Words from "Colors" category.
                ArrayList<Word> colors = new ArrayList<>();
                colors.add(new Word("red", "weṭeṭṭi", R.drawable.color_red));
                colors.add(new Word("mustard yellow", "chiwiiṭә", R.drawable.color_mustard_yellow));
                colors.add(new Word("dusty yellow", "ṭopiisә", R.drawable.color_dusty_yellow));
                colors.add(new Word("green", "chokokki", R.drawable.color_green));
                colors.add(new Word("brown", "ṭakaakki", R.drawable.color_brown));
                colors.add(new Word("gray", "ṭopoppi", R.drawable.color_gray));
                colors.add(new Word("black", "kululli", R.drawable.color_black));
                colors.add(new Word("white", "kelelli", R.drawable.color_white));
                return colors;

            case 4:
                // Returning the list of Words from "Phrases" category.
                ArrayList<Word> phrases = new ArrayList<>();
                phrases.add(new Word("Where are you going?",
                        "minto wuksus"));
                phrases.add(new Word("What is your name?",
                        "tinnә oyaase'nә"));
                phrases.add(new Word("My name is...", "oyaaset..."));
                phrases.add(new Word("How are you feeling?",
                        "michәksәs?"));
                phrases.add(new Word("I’m feeling good.",
                        "kuchi achit"));
                phrases.add(new Word("Are you coming?",
                        "әәnәs'aa?"));
                phrases.add(new Word("Yes, I’m coming.",
                        "hәә’ әәnәm"));
                phrases.add(new Word("I’m coming.", "әәnәm"));
                phrases.add(new Word("Let’s go.", "yoowutis"));
                phrases.add(new Word("Come here.", "әnni'nem"));
                return phrases;

            default:
                return null;
        }
    }
}