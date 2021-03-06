package com.minghui_liu.android.photogallery;

/**
 * Created by kevin on 11/10/15.
 */
public class GalleryItem {
    private String mCaption;
    private String mID;
    private String mUrl;

    //  Getters and setters
    public String getCaption() {
        return mCaption;
    }

    public void setCaption(String caption) {
        mCaption = caption;
    }

    public String getID() {
        return mID;
    }

    public void setID(String ID) {
        mID = ID;
    }

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String url) {
        mUrl = url;
    }

    @Override
    public String toString() {
        return mCaption;
    }
}
