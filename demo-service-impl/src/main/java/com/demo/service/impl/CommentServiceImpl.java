package com.demo.service.impl;

import org.springframework.stereotype.Service;

import com.demo.entity.Comment;
import com.demo.inner.base.serviceimpl.BaseServiceImpl;
import com.demo.mapper.CommentMapper;
import com.demo.service.CommentService;

@Service
public class CommentServiceImpl extends BaseServiceImpl<Comment, CommentMapper> implements CommentService{

}
