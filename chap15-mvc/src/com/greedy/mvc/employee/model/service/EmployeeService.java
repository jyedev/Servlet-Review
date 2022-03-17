package com.greedy.mvc.employee.model.service;

import org.apache.ibatis.session.SqlSession;

import com.greedy.mvc.employee.model.dao.EmployeeDAO;
import com.greedy.mvc.employee.model.dto.EmployeeDTO;
import static com.greedy.mvc.common.mybatis.Template.getSqlSession;

public class EmployeeService {
	
	private final EmployeeDAO empDAO;
	
	public EmployeeService() {
		empDAO = new EmployeeDAO();
	}

	public EmployeeDTO selectOneEmpById(String empId) {

		SqlSession session = getSqlSession();
		
		EmployeeDTO selectedEmp = empDAO.selectEmpById(session, empId);
		
		session.close();
		
		return selectedEmp;
	}

	
	
}
