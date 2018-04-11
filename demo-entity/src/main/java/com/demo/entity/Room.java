package com.demo.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Table;

import com.demo.base.entity.BaseEntity;

@Table(name = "room")
public class Room extends BaseEntity{
	@Column(name = "roomName")
    private String roomName;

	@Column(name = "roomDate")
    private Date roomDate;

	@Column(name = "roomNum")
    private Integer roomNum;

	@Column(name = "roomTime")
    private String roomTime;

	@Column(name = "userName")
    private String userName;

	@Column(name = "userPhone")
    private String userPhone;

	@Column(name = "roomRemark")
    private String roomRemark;

	@Column(name = "roomIsNow")
    private String roomIsNow;

	@Column(name = "createTime")
    private Date createTime;

	
	@Column(name = "userId")
	private String userid;
	
    public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName == null ? null : roomName.trim();
    }

    public Date getRoomDate() {
        return roomDate;
    }

    public void setRoomDate(Date roomDate) {
        this.roomDate = roomDate;
    }

    public Integer getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(Integer roomNum) {
        this.roomNum = roomNum;
    }

    public String getRoomTime() {
        return roomTime;
    }

    public void setRoomTime(String roomTime) {
        this.roomTime = roomTime == null ? null : roomTime.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    public String getRoomRemark() {
        return roomRemark;
    }

    public void setRoomRemark(String roomRemark) {
        this.roomRemark = roomRemark == null ? null : roomRemark.trim();
    }

    public String getRoomIsNow() {
        return roomIsNow;
    }

    public void setRoomIsNow(String roomIsNow) {
        this.roomIsNow = roomIsNow == null ? null : roomIsNow.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}