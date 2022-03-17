package com.greedy.mvc.employee.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.greedy.mvc.employee.model.dto.EmployeeDTO;
import com.greedy.mvc.employee.model.service.EmployeeService;

@WebServlet("/employee/select")
public class SelectOneEmpByIdServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//1.
		String empId = request.getParameter("empId");
		
		System.out.println("empId : " + empId);
	
		
		//2.
		EmployeeService empService = new EmployeeService();
		EmployeeDTO selectedEmp = empService.selectOneEmpById(empId);
	}


}
