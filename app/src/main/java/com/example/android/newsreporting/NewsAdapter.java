package com.example.android.newsreporting;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by baba on 9/13/2016.
 */
public class NewsAdapter extends ArrayAdapter<News> {
    public NewsAdapter(Context context, List<News> objects) {
        super(context, 0, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.news_list_item
                    , parent, false);
        }

        News currentNews = getItem(position);
        TextView mSectionName = (TextView) listItemView.findViewById(R.id.section_name);
        mSectionName.setText(currentNews.getSectionName());
        TextView mAuthorName = (TextView) listItemView.findViewById(R.id.author_name);
        mAuthorName.setText(currentNews.getAuthorName());
        TextView mWebTitle = (TextView) listItemView.findViewById(R.id.web_title);
        mWebTitle.setText(currentNews.getWebTitle());
        return listItemView;
    }
}
