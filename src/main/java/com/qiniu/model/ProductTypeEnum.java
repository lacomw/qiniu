package com.qiniu.model;

/**
 * Created by lacomw on 2017/10/6.
 */
public enum ProductTypeEnum {
    glove("手套"),
    xiedian("鞋垫"),
    huxi("护膝")
    ;
    private String title;

    ProductTypeEnum(String title) {
        this.title = title;
    }

    public String gettitle() {
        return title;
    }

    public void setTitle(String name) {
        this.title = name;
    }
}
