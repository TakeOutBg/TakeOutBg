package com.demo.controller.user;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.entity.Coupon;
import com.demo.entity.UserCoupou;
import com.demo.mapper.CouponMapper;
import com.demo.service.CouponService;

@Controller
@RequestMapping(value = "/coupon")
public class CouponController extends BaseController<Coupon, CouponMapper, CouponService>{

	@RequestMapping(value = "/getAvaliableList.do")
	@ResponseBody
	public List<UserCoupou> getAvaliableList(){
		return service.getAvaliableList();
	}
	
	@RequestMapping(value = "/getCardList.do")
	@ResponseBody
	public List<UserCoupou> getCardList(String userId,String type){
		List<UserCoupou> list = new ArrayList<UserCoupou>();
		switch (type) {
		case "unuse":
			list = service.getUnuseList(userId);
			break;
		case "used":
			list = service.getUsedList(userId);
			break;
		case "dayout":
			list = service.getDateoutList(userId);
			break;
		default:
			break;
		}
		
		return list;
	}
}
