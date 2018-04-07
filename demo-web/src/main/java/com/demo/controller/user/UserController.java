package com.demo.controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.entity.User;
import com.demo.inner.base.controller.BaseController;
import com.demo.mapper.UserMapper;
import com.demo.service.UserService;

@Controller
@RequestMapping(value = "/user")
public class UserController extends BaseController<User, UserMapper,UserService>{

}
