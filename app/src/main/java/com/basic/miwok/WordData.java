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
                numbers.add(new Word("one", "lutti"));
                numbers.add(new Word("two", "otiiko"));
                numbers.add(new Word("three", "tolookosu"));
                numbers.add(new Word("four", "oyyisa"));
                numbers.add(new Word("five", "massokka"));
                numbers.add(new Word("six", "temmokka"));
                numbers.add(new Word("seven", "kenekaku"));
                numbers.add(new Word("eight", "kawinta"));
                numbers.add(new Word("nine", "wo’e"));
                numbers.add(new Word("ten", "na’aacha"));
                return numbers;

            case 2:
                // Returning the list of Words from "Family Members" category.
                ArrayList<Word> family = new ArrayList<>();
                family.add(new Word("father", "әpә"));
                family.add(new Word("mother", "әṭa"));
                family.add(new Word("son", "angsi"));
                family.add(new Word("daughter", "tune"));
                family.add(new Word("older brother", "taachi"));
                family.add(new Word("younger brother", "chalitti"));
                family.add(new Word("older sister", "teṭe"));
                family.add(new Word("younger sister", "kolliti"));
                family.add(new Word("grandmother ", "ama"));
                family.add(new Word("grandfather", "paapa"));
                return family;

            case 3:
                // Returning the list of Words from "Colors" category.
                ArrayList<Word> colors = new ArrayList<>();
                colors.add(new Word("red", "weṭeṭṭi"));
                colors.add(new Word("mustard yellow", "chiwiiṭә"));
                colors.add(new Word("dusty yellow", "ṭopiisә"));
                colors.add(new Word("green", "chokokki"));
                colors.add(new Word("brown", "ṭakaakki"));
                colors.add(new Word("gray", "ṭopoppi"));
                colors.add(new Word("black", "kululli"));
                colors.add(new Word("white", "kelelli"));
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