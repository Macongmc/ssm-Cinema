package com.ydlclass.entity;

import java.io.Serializable;

/**
 * (TRoom)实体类
 *
 * @author makejava
 * @since 2022-04-20 19:27:15
 */
public class TRoom implements Serializable {
    private static final long serialVersionUID = -27090492327707398L;
    
    private Integer id;
    
    private String name;
    
    private String roomContent;
    
    private Integer type;
    
    private Integer num;
    
    private Integer cinemaId;


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

    public String getRoomContent() {
        return roomContent;
    }

    public void setRoomContent(String roomContent) {
        this.roomContent = roomContent;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getCinemaId() {
        return cinemaId;
    }

    public void setCinemaId(Integer cinemaId) {
        this.cinemaId = cinemaId;
    }

}

