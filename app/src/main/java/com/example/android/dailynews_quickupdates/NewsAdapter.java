package com.example.android.dailynews_quickupdates;


import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.StrictMode;
import android.support.annotation.NonNull;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import static com.example.android.dailynews_quickupdates.MainActivity.LOG_TAG;

public class NewsAdapter extends ArrayAdapter<News>{

    public NewsAdapter(Context context, List<News> news)
    {
        super(context,0,news);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.news_list_item, parent, false);
        }

        //Find current news at a given position in the list item
        News currentNews = getItem(position);

        TextView headingView = (TextView)listItemView.findViewById(R.id.heading_text_view);
        headingView.setText(currentNews.getTitle());

        TextView authorView = (TextView)listItemView.findViewById(R.id.description_text_view);
        authorView.setText(currentNews.getDecription());

        ImageView imageView = (ImageView)listItemView.findViewById(R.id.image_view);
        imageView.setImageBitmap(currentNews.getUrlToImage());

        // Return the list item view that is now showing the appropriate data
        return listItemView;

    }

}
