package com.example.android.dailynews_quickupdates;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public class News {

    //Title of News
    private String mTitle;

    //Description of news
    private String mDesc;


    //URL of news
    private String mUrl;

    private Bitmap mUrlToImage;

    //public constructor
    public News(String title, String desc, String url, Bitmap urlToImage)
    {
        mTitle=title;
        mDesc=desc;
        mUrl=url;
        mUrlToImage=urlToImage;
    }

    public String getTitle()
    {
        return mTitle;
    }
    public String getDecription()
    {
        return mDesc;
    }
    public String getUrl()
    {
        return mUrl;
    }
    public Bitmap getUrlToImage(){
        return mUrlToImage;
    }
}
