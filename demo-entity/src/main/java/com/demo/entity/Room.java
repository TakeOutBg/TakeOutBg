package com.demo.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.demo.base.entity.BaseEntity;

@Table(name = "room")
public class Room extends BaseEntity{
	@Column(name = "ROOM_NAME")
    private String roomName;

	@Column(name = "ROOM_DATE")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date roomDate;

	@Column(name = "ROOM_NUM")
    private Integer roomNum;

	@Column(name = "ROOM_TIME")
    private String roomTime;

	@Column(name = "USER_NAME")
    private String userName;

	@Column(name = "USER_PHONE")
    private String userPhone;

	@Column(name = "ROOM_REMARK")
    private String roomRemark;

	@Column(name = "ROOM_IS_NOW")
    private String roomIsNow;

	@Column(name = "CREATE_TIME")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

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