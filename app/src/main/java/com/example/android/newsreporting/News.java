package com.example.android.newsreporting;

/**
 * Created by baba on 9/13/2016.
 */
public class News {
    String webTitle;
    String sectionName;
    String webUrl;
    String authorName;

    public News(String authorName, String sectionName, String webTitle, String webUrl) {
        this.authorName = authorName;
        this.sectionName = sectionName;
        this.webTitle = webTitle;
        this.webUrl = webUrl;
    }

    public String getSectionName() {
        return sectionName;
    }

    public String getWebTitle() {
        return webTitle;
    }

    public String getWebUrl() {
        return webUrl;
    }

    public String getAuthorName() {
        return authorName;
    }
}
