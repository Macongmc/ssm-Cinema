package com.ydlclass.entity;

import java.io.Serializable;

/**
 * (TCinema)实体类
 *
 * @author makejava
 * @since 2022-04-20 19:27:09
 */
public class TCinema implements Serializable {
    private static final long serialVersionUID = -46428850372668601L;
    
    private Integer id;
    
    private String name;
    
    private String areaId;
    
    private String areaContent;
    
    private Double score;
    
    private String phone;
    
    private String characteristic;
    
    private String content;
    
    private String discount;
    
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

    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }

    public String getAreaContent() {
        return areaContent;
    }

    public void setAreaContent(String areaContent) {
        this.areaContent = areaContent;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCharacteristic() {
        return characteristic;
    }

    public void setCharacteristic(String characteristic) {
        this.characteristic = characteristic;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

}

