package com.demo.controller.user;

import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.entity.User;
import com.demo.inner.dto.AjaxResult;
import com.demo.mapper.UserMapper;
import com.demo.service.UserService;

@Controller
@ResponseBody
@RequestMapping(value = "/user")
public class UserController extends BaseController<User, UserMapper,UserService>{

	
	@RequestMapping(value = "/login.do", method = RequestMethod.GET)
	public AjaxResult<User> login(String username,String password,HttpServletRequest request) {
		
		
		
		return null;
	}
	
	
	@RequestMapping(value = "/regist.do",method = RequestMethod.GET)
	public AjaxResult<User> regist(String username,String phone){
		
		String id = UUID.randomUUID().toString();
		
		User user = new User(id,username,phone);
		service.insert(user);
		
		AjaxResult<User> result = new AjaxResult<User>();
		
		result.setStatus("");
		result.setMessage("用户创建成功");
		result.setObject(user);
		
		return result;
	}
	
	@RequestMapping(value = "/findUser.do",method = RequestMethod.GET)
	public AjaxResult<User> findUser(String username){
		
		
		AjaxResult<User> result = new AjaxResult<User>();
		
		return result;
	}
	
	
	
	
	
}
