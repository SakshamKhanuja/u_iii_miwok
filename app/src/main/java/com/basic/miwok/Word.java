package com.basic.miwok;

/**
 * Template contains words in default language and their Miwok translation.
 */
public class Word {
    // Default translation of a word.
    private final int mDefaultTranslation;

    // Miwok translation of a word.
    private final int mMiwokTranslation;

    // Word image resource ID.
    private int mImageResourceID;

    // Word audio resource ID.
    private final int mAudioResourceID;

    // Indicates whether this Word has an image associated with it or not.
    private boolean wordHasImage;

    public Word(int mDefaultTranslation, int mMiwokTranslation, int mAudioResourceID) {
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiwokTranslation = mMiwokTranslation;
        this.mAudioResourceID = mAudioResourceID;
        mImageResourceID = 0;
        wordHasImage = false;
    }

    public Word(int mDefaultTranslation, int mMiwokTranslation, int mImageResourceID,
                int mAudioResourceID) {
        this(mDefaultTranslation, mMiwokTranslation, mAudioResourceID);
        this.mImageResourceID = mImageResourceID;
        wordHasImage = true;
    }

    /**
     * @return The default translation of the word.
     */
    public int getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * @return The Miwok translation of the word.
     */
    public int getMiwokTranslation() {
        return mMiwokTranslation;
    }

    /**
     * @return The Miwok image resource ID associated with this Word.
     */
    public int getImageResourceID() {
        return mImageResourceID;
    }

    /**
     * @return The Miwok audio resource ID associated with this Word.
     */
    public int getAudioResourceID() {
        return mAudioResourceID;
    }

    /**
     * @return This returns 'true' for all Word categories except "Phrases".
     */
    public boolean isWordNotPhrase() {
        return wordHasImage;
    }
}