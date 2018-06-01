package com.demo.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Table;

import com.demo.base.entity.BaseEntity;
import com.demo.base.entity.annotation.EnableExample;
import com.fasterxml.jackson.annotation.JsonFormat;

@Table(name = "coupon")
public class Coupon extends BaseEntity{
	
	@Column(name = "name")
	@EnableExample
	private String name;

	@Column(name = "low_price")
	@EnableExample
    private Integer lowPrice;

	@Column(name = "reduce")
	@EnableExample
    private Integer reduce;

	@Column(name = "start_time")
	@EnableExample
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date startTime;

	@Column(name = "end_time")
	@EnableExample
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date endTime;

	@Column(name = "type")
	@EnableExample
    private String type;

	@Column(name = "create_time")
	@EnableExample
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getLowPrice() {
        return lowPrice;
    }

    public void setLowPrice(Integer lowPrice) {
        this.lowPrice = lowPrice;
    }

    public Integer getReduce() {
        return reduce;
    }

    public void setReduce(Integer reduce) {
        this.reduce = reduce;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}