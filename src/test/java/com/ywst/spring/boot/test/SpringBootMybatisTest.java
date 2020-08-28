package com.ywst.spring.boot.test;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.ywst.spring.boot.controller.EmpController;
import com.ywst.spring.boot.entity.Emp;
import com.ywst.spring.boot.service.api.EmpService;


@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootMybatisTest {
	
	@Autowired
	private DataSource dataSource;
	
	@Autowired
	private EmpService empService;
	
	@Autowired
	private EmpController empController;
	
	//测试获取连接
	@Test
	public void testConnection () throws SQLException {
		
		Connection connection = dataSource.getConnection();
		System.out.println(connection);
		
	}
	
	//测试Service类
	@Test
	public void testGetEmpList() {
		
		List<Emp> list = empService.getAll();
		for (Emp emp : list) {
			System.out.println(emp);
		}
		
	}
	//测试Handler类
	@Test
	public void testHandlerGetEmpList() {
		
		List<Emp> list = empController.listEmp();
		for (Emp emp : list) {
			System.out.println(emp);
		}
		
	}

}
