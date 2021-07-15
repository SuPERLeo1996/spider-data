package com.leo.spider.data.entity;

/**
 * @ClassName Catalog.java
 * @Author Leo
 * @Description
 * @Date 2021/7/14
 */

public class Catalog {
    private Integer id;
    private String url;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
