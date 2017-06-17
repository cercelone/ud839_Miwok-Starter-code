package com.example.android.miwok;

/**
 * Created by Ciprian on 5/31/2017.
 */

public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImage;
    private int mAudio;

    public Word (String defaultTranslation, String miwokTranslation, int image, int audio){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImage = image;
        mAudio = audio;
    }

    public String getMiwokTranslation (){
        return mMiwokTranslation;
    }
    public String getDefaultTranslation (){
        return mDefaultTranslation;
    }
    public int getImage () { return mImage; }
    public int getAudio () {return mAudio;}
}
