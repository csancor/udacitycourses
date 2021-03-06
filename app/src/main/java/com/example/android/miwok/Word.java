package com.example.android.miwok;

/**
 * {@link Word} Represents a vocabulary word that the user wants to learn.
 * it contains a default translation, a Miwok translation for that word and an image for that word
 */
public class Word {
    // Default translation for the word
    private String mDefaultTranslation;

    // Miwok translation for the word
    private String mMiwokTranslation;

    //Audio resource
    private int mAudioResourceId;

    /**
     * Image resource Id for the word
     */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /**
     * Constant value that represents no image was provided for this word
     */
    private static final int NO_IMAGE_PROVIDED = -1;


    /**
     * Create a new Word object
     *
     * @param defaultTranslation is the word that the user is already familiar with
     * @param miwokTranslation   is the word in the Miwok language
     * @param audioResourceId is the resource ID for the audio file associated with this word
     **/
    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;
    }

    /**
     * Create a new Word object
     *
     * @param defaultTranslation is the word that the user is already familiar with
     * @param miwokTranslation   is the word in the Miwok language
     * @param imageResourceId    is the image assotiated to the word
     **/
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }


    /**
     * Get the default translation of the word
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the miwok translation of the word
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    /**
     * Return the image according to the word
     */
    public int getImageResourceId() {

        return mImageResourceId;
    }

    /**
     * Returns wheter or not there is an image for this word
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;

    }

    /**
     * Return the audio resource ID of the word
     */
    public int getAudioResourceId(){
        return mAudioResourceId;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mAudioResourceId=" + mAudioResourceId +
                ", mImageResourceId=" + mImageResourceId +
                '}';
    }
}
