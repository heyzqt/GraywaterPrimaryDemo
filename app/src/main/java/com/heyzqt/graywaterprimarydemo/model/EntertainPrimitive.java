package com.heyzqt.graywaterprimarydemo.model;

import java.util.List;

/**
 * Created by heyzqt on 2018/10/23.
 */

public class EntertainPrimitive implements Primitive {

    private List<String> urls;
    private List<String> titles;

    public EntertainPrimitive(List<String> urls, List<String> titles) {
        this.urls = urls;
        this.titles = titles;
    }

    public List<String> getUrls() {
        return urls;
    }

    public List<String> getTitles() {
        return titles;
    }
}
