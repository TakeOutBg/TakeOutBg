/**
 * @author kexiaohong
 * @version 1.0 2017年12月16日
 *
 */
package com.demo.inner.base.service;

import java.util.List;

import com.demo.base.entity.BaseEntity;
import com.demo.inner.base.mapper.BaseMapper;
import com.github.pagehelper.Page;

import tk.mybatis.mapper.entity.Example;

public interface BaseService<T extends BaseEntity,E extends BaseMapper<T>>  {
	public List<T> select(T entity);
	public List<T> selectAll();
	public T selectByPrimaryKey(String uuid);
	public List<T> selectByExample(T entity);
	public List<T> selectByExample(Example example);
	public int selectCount(T entity);
	public int selectCountByExample(T entity);
	public T selectOne(T entity);
	public T selectOneByExample(T entity);
	public int insert(T entity);
	public int insertSelective(T entity);
	public int updateByPrimaryKey(T entity);
	public int updateByPrimaryKeySelective(T entity);
	public int updateByExample(T entity, T entity2);
	public int updateByExampleSelective(T entity,T entity2);
	public int delete(T entity);
	public int deleteByExample(T entity);
	public int deleteByPrimaryKey(T entity);
	public Page<T> getQueryByPage(T entity, Page<T> page);
}
