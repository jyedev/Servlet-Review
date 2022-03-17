package com.greedy.mvc.employee.model.dao;

import org.apache.ibatis.session.SqlSession;

import com.greedy.mvc.employee.model.dto.EmployeeDTO;

public class EmployeeDAO {

	public EmployeeDTO selectEmpById(SqlSession session, String empId) {
		
		return session.selectOne("EmployeeDAO.selectEmpById", empId);
	}

	
	
}
