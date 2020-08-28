package com.ywst.spring.boot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ywst.spring.boot.entity.Emp;
import com.ywst.spring.boot.mapper.EmpMapper;
import com.ywst.spring.boot.service.api.EmpService;

@Service
@Transactional(readOnly = true)
public class EmpServiceImpl implements EmpService{

	@Autowired
	private EmpMapper empMapper;
	
	@Override
	public List<Emp> getAll() {
		return empMapper.selectAll();
	}

	
}
