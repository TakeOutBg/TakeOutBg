package com.demo.service.impl;

import org.springframework.stereotype.Service;

import com.demo.entity.UserCoupou;
import com.demo.inner.base.serviceimpl.BaseServiceImpl;
import com.demo.mapper.UserCoupouMapper;
import com.demo.service.UserCoupouService;

@Service
public class UserCoupouServiceImpl extends BaseServiceImpl<UserCoupou,UserCoupouMapper> implements UserCoupouService{

}
