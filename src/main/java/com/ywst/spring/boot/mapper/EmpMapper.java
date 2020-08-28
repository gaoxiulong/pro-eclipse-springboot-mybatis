package com.ywst.spring.boot.mapper;

import java.util.List;

import com.ywst.spring.boot.entity.Emp;

public interface EmpMapper {

	List<Emp> selectAll();
}
