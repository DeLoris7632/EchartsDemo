package com.chart.pojo;

import org.apache.ibatis.type.Alias;

/**
*
*<p>Title:To.java</p>
*<p>Description: </p>
*<p>Company: </p>
*@author  妖术
*@data 2017年12月5日上午11:10:17
*@version 1.0
*/
@Alias("to")
public class To {
private Integer id;
private String age;
public To() {
	super();
	// TODO Auto-generated constructor stub
}
public To(Integer id, String age) {
	super();
	this.id = id;
	this.age = age;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getAge() {
	return age;
}
public void setAge(String age) {
	this.age = age;
}



}

