package com.basic.miwok;

/**
 * Template contains words in default language and their Miwok translation.
 */
public class Word {
    // Default translation of a word.
    private final String mDefaultTranslation;

    // Miwok translation of a word.
    private final String mMiwokTranslation;

    // Word image resource ID.
    private int mImageResourceID;

    // Indicates whether this Word has an image associated with it or not.
    private boolean wordHasImage;

    public Word(String mDefaultTranslation, String mMiwokTranslation) {
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiwokTranslation = mMiwokTranslation;
        mImageResourceID = 0;
        wordHasImage = false;
    }

    public Word(String mDefaultTranslation, String mMiwokTranslation, int mImageResourceID) {
        this(mDefaultTranslation, mMiwokTranslation);
        this.mImageResourceID = mImageResourceID;
        wordHasImage = true;
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

    /**
     * @return The Miwok image resource ID associated with this Word.
     */
    public int getImageResourceID() {
        return mImageResourceID;
    }

    /**
     * @return This returns 'true' for all Word categories except "Phrases".
     */
    public boolean isWordNotPhrase() {
        return wordHasImage;
    }
}