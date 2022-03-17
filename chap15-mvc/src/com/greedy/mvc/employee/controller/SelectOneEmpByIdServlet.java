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
		
		System.out.println("selectedEmp : " + selectedEmp);
		
		//3.
		String path = "";
		if(selectedEmp != null) {
			path = "/WEB-INF/views/employee/showEmpInfo.jsp";
			request.setAttribute("selectedEmp", selectedEmp);
		} else {
			path = "/WEB-INF/views/common/errorPage.jsp";
			request.setAttribute("message", "직원 정보 조회 실패!");
		}
		
		request.getRequestDispatcher(path).forward(request, response);
	}


}
