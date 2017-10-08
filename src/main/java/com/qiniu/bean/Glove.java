package com.qiniu.bean;

import java.util.List;

/**
 * Created by lacomw on 2017/10/6.
 */
public class Glove {
    private long id;
    private String name;
    private String title;
    private List<String> pics;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getPics() {
        return pics;
    }

    public void setPics(List<String> pics) {
        this.pics = pics;
    }
}
