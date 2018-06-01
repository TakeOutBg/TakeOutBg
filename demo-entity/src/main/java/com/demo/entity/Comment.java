package com.demo.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.demo.base.entity.BaseEntity;
import com.demo.base.entity.annotation.EnableExample;

@Table(name = "comment")
public class Comment extends BaseEntity{

	@Column(name = "create_time")
	@EnableExample
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date createTime;

	@Column(name = "start")
	@EnableExample
	private Integer start;

	@Column(name = "content")
	@EnableExample
    private String content;
	
	@Column(name = "room_id")
	@EnableExample
    private String roomId;
	
	@Column(name = "user_name")
	@EnableExample
	private String userName;
	
	@Column(name = "image")
	@EnableExample
	private String image;

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId == null ? null : roomId.trim();
    }

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
    
}