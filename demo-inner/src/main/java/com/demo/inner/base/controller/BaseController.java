/**
 * @author kexiaohong
 * @version 1.0 2017年12月16日
 *
 */
package com.demo.inner.base.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.demo.base.entity.BaseEntity;
import com.demo.inner.base.mapper.BaseMapper;
import com.demo.inner.base.service.BaseService;
import com.github.pagehelper.Page;

public class BaseController<T extends BaseEntity, E extends BaseMapper<T>, S extends BaseService<T, E>> {

	@Autowired
	protected S service;
	
	
	public List<T> select(T entity) {
		return service.select(entity);
	}

	
	public List<T> selectAll() {
		return service.selectAll();
	}

	
	public T selectByPrimaryKey(String uuid) {
		return service.selectByPrimaryKey(uuid);
	}

	
	public List<T> selectByExample(T entity) {
		return service.selectByExample(entity);
	}

	
	public int selectCount(T entity) {
		return service.selectCount(entity);
	}

	
	public int selectCountByExample(T entity) {
		return service.selectCountByExample(entity);
	}

	
	public T selectOne(T entity) {
		return service.selectOne(entity);
	}

	
	public T selectOneByExample(T entity) {
		return service.selectOneByExample(entity);
	}

	
	public int insert(T entity) {
		return service.insert(entity);
	}

	
	public int insertSelective(T entity) {
		return service.insertSelective(entity);
	}

	
	public int updateByPrimaryKey(T entity) {
		return service.updateByPrimaryKey(entity);
	}

	
	public int updateByPrimaryKeySelective(T entity) {
		return service.updateByPrimaryKeySelective(entity);
	}

	
	public int updateByExample(T entity) {
		return service.updateByExample(entity);
	}

	
	public int updateByExampleSelective(T entity) {
		return service.updateByExampleSelective(entity);
	}

	
	public int delete(T entity) {
		return service.delete(entity);
	}

	
	public int deleteByExample(T entity) {
		return service.deleteByExample(entity);
	}

	
	public int deleteByPrimaryKey(T entity) {
		return service.deleteByPrimaryKey(entity);
	}
	
	public Page<T> getQueryByPage(T entity, Page<T> page){
		return null;
	}
}
