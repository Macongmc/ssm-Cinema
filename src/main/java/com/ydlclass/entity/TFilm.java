package com.ydlclass.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (TFilm)实体类
 *
 * @author makejava
 * @since 2022-04-20 19:27:15
 */
public class TFilm implements Serializable {
    private static final long serialVersionUID = -88871198410969961L;
    
    private Integer id;
    
    private String name;
    
    private String engName;
    
    private String language;
    
    private String type;
    
    private String showType;
    
    private String director;
    
    private String actors;
    
    private String length;
    
    private Date firstData;
    
    private String content;
    
    private Double score;
    
    private String simpleContent;
    
    private String country;
    
    private String imgUrl;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEngName() {
        return engName;
    }

    public void setEngName(String engName) {
        this.engName = engName;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getShowType() {
        return showType;
    }

    public void setShowType(String showType) {
        this.showType = showType;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getActors() {
        return actors;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public Date getFirstData() {
        return firstData;
    }

    public void setFirstData(Date firstData) {
        this.firstData = firstData;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public String getSimpleContent() {
        return simpleContent;
    }

    public void setSimpleContent(String simpleContent) {
        this.simpleContent = simpleContent;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

}

