package com.chart.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.chart.pojo.To;

/**
*
*<p>Title:ToMapper.java</p>
*<p>Description: </p>
*<p>Company: </p>
*@author  妖术
*@data 2017年12月5日上午11:13:35
*@version 1.0
*/
@Mapper
public interface ToMapper {

	
	List<To> find();
}

