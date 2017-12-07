package com.chart.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chart.mapper.ToMapper;
import com.chart.pojo.To;

/**
*
*<p>Title:ToController.java</p>
*<p>Description: </p>
*<p>Company: </p>
*@author  妖术
*@data 2017年12月5日上午11:17:24
*@version 1.0
*/
@Controller
public class ToController {

	@Resource
	private ToMapper toMapper;
	
	
	@RequestMapping("/find")
	@ResponseBody
	public List<To> find(Model model){
		List<To> find = toMapper.find();
		return find;
	}
	
	@RequestMapping("/")
	public String to(){
		return "show2";
		}
}

