package com.demo.controller.user;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.entity.UserCoupou;
import com.demo.inner.dto.AjaxResult;
import com.demo.mapper.UserCoupouMapper;
import com.demo.service.UserCoupouService;

import tk.mybatis.mapper.entity.Example;

@Controller
@RequestMapping(value = "/usercoupou")
public class UserCoupouController extends BaseController<UserCoupou, UserCoupouMapper, UserCoupouService>{

	@RequestMapping(value = "/insertSelective.do",method={RequestMethod.POST})
	@ResponseBody
	public AjaxResult<UserCoupou> insertSelective(@RequestBody UserCoupou record){
		AjaxResult<UserCoupou> ajax = new AjaxResult<UserCoupou>();
		Example example = new Example(UserCoupou.class);
		example.createCriteria().andEqualTo("couponId",record.getCouponId()).andEqualTo("userId",record.getUserId());
		List<UserCoupou> list = service.selectByExample(example);
		if(null != list && list.size() > 0){
			ajax.setStatus("500");
			ajax.setMessage("您已领取该优惠券");
			return ajax;
		}
		
		record.setId(UUID.randomUUID().toString());
		int flag = service.insertSelective(record);
		if(flag == 0){
			ajax.setStatus("500");
			ajax.setMessage("领取失败");
		}else{
			ajax.setStatus("200");
			ajax.setMessage("领取成功");
			ajax.setObject(service.selectByPrimaryKey(record.getId()));
		}
		return ajax;
	}
}
