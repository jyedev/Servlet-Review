package com.greedy.mvc.employee.model.service;

import org.apache.ibatis.session.SqlSession;

import com.greedy.mvc.employee.model.dao.EmployeeDAO;
import com.greedy.mvc.employee.model.dto.EmployeeDTO;
import static com.greedy.mvc.common.mybatis.Template.getSqlSession;

import java.util.List;

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

	public List<EmployeeDTO> selectAllEmp() {
		
		SqlSession session = getSqlSession();
		
		List<EmployeeDTO> empList = empDAO.selectAllEmp(session);
		
		session.close();
		
		return empList;
	}

	public int insertEmp(EmployeeDTO emp) {
		
		SqlSession session = getSqlSession();
		
		int result = empDAO.insertEmp(session, emp);
		
		if(result > 0) {
			session.commit();
		} else {
			session.rollback();
		}
		
		session.close();
		
		return result;
		
	}

	public int updateEmp(EmployeeDTO emp) {
		
		SqlSession session = getSqlSession();
		
		int result = empDAO.updateEmp(session, emp);
		
		if(result > 0) {
			session.commit();
		} else {
			session.rollback();
		}
		
		session.close();
		
		return result;
	}

	
	
}
