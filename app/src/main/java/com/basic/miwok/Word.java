package com.basic.miwok;

/**
 * Template contains words in default language and their Miwok translation.
 */
public class Word {
    // Default translation of a word.
    private final String mDefaultTranslation;

    // Miwok translation of a word.
    private final String mMiwokTranslation;

    public Word(String mDefaultTranslation, String mMiwokTranslation) {
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiwokTranslation = mMiwokTranslation;
    }

    /**
     * @return The default translation of the word.
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * @return The Miwok translation of the word.
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }
}