package com.heyzqt.graywaterprimarydemo.bean;

import java.io.Serializable;

/**
 * Created by heyzqt on 2019/1/29.
 */

public class EntertainItem implements Serializable {
    private String id;
    private String url;
    private String title;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
