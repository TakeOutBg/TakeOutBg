package com.demo.controller.user;

import java.util.UUID;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
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

	
	@RequestMapping(value = "/loginOrRegister.do", method = RequestMethod.POST)
	public AjaxResult<User> login(@RequestBody User user) {
		User _user = service.selectByPrimaryKey(user.getId());
		int flag = 1;
		if(null == _user){
			flag = service.insertSelective(user);
			_user = user;
		}
		AjaxResult<User> result = new AjaxResult<>();
		if(flag == 0){
			result.setStatus("500");
		}else{
			result.setStatus("202");
			result.setObject(_user);
		}
		return result;
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
