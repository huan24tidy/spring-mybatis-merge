package com.taidi.vo;

public class Home {
    private Integer id;

    private String homeName;

    private Integer homeAge;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHomeName() {
        return homeName;
    }

    public void setHomeName(String homeName) {
        this.homeName = homeName == null ? null : homeName.trim();
    }

    public Integer getHomeAge() {
        return homeAge;
    }

    public void setHomeAge(Integer homeAge) {
        this.homeAge = homeAge;
    }
}