package com.ydlclass.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (TOrder)实体类
 *
 * @author makejava
 * @since 2022-04-20 19:27:15
 */
public class TOrder implements Serializable {
    private static final long serialVersionUID = 460876400071119459L;
    
    private Integer id;
    
    private Integer userId;
    
    private Integer recordId;
    
    private Integer seatNum;
    
    private String seatInfo;
    
    private Double money;
    
    private Integer status;
    
    private Date addTime;
    
    private String phone;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getRecordId() {
        return recordId;
    }

    public void setRecordId(Integer recordId) {
        this.recordId = recordId;
    }

    public Integer getSeatNum() {
        return seatNum;
    }

    public void setSeatNum(Integer seatNum) {
        this.seatNum = seatNum;
    }

    public String getSeatInfo() {
        return seatInfo;
    }

    public void setSeatInfo(String seatInfo) {
        this.seatInfo = seatInfo;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

}

