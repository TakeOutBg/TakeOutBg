package com.demo.controller.user;

import java.util.UUID;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.entity.Comment;
import com.demo.inner.dto.AjaxResult;
import com.demo.mapper.CommentMapper;
import com.demo.service.CommentService;

@Controller
@RequestMapping(value = "comment")
public class CommentController extends BaseController<Comment, CommentMapper, CommentService>{

	@RequestMapping(value = "/insertSelective.do",method={RequestMethod.POST})
	@ResponseBody
	public AjaxResult<Comment> insertSelective(@RequestBody Comment record){
		AjaxResult<Comment> ajax = new AjaxResult<Comment>();
		record.setId(UUID.randomUUID().toString());
		int flag = service.insertSelective(record);
		if(flag == 0){
			ajax.setStatus("500");
			ajax.setMessage("插入失败");
		}else{
			ajax.setStatus("200");
			ajax.setMessage("插入成功");
			ajax.setObject(service.selectByPrimaryKey(record.getId()));
		}
		return ajax;
	}
}
