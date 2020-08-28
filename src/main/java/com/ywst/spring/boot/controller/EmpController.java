package com.ywst.spring.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ywst.spring.boot.entity.Emp;
import com.ywst.spring.boot.service.api.EmpService;

@Controller
public class EmpController {

	@Autowired
	private EmpService empService;

	@RequestMapping("/ListEmp")
	@ResponseBody
	public List<Emp> listEmps() {
		return empService.getAll();
	}

	@RequestMapping("/to/index")
	public String index() {
		return "index";
	}
	
	public List<Emp> listEmp(){
		return empService.getAll();
	}
}
