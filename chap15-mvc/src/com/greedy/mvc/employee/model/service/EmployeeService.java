package com.greedy.mvc.employee.model.service;

import org.apache.ibatis.session.SqlSession;

import com.greedy.mvc.employee.model.dto.EmployeeDTO;
import static com.greedy.mvc.common.mybatis.Template.getSqlSession;

public class EmployeeService {

	public EmployeeDTO selectOneEmpById(String empId) {

		SqlSession session = getSqlSession();
		
		System.out.println(session);
		
		return null;
	}

	
	
}
