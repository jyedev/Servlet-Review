package com.greedy.section01.querystring;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/querystring")
public class QueryStringTestServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
		System.out.println("이름 : " + name);
		
		int age = Integer.parseInt(request.getParameter("age"));
		System.out.println("나이 : " + age);
		
		java.sql.Date birthday = java.sql.Date.valueOf(request.getParameter("birthday"));
		System.out.println("생일 : " + birthday);
		
		String gender = request.getParameter("gender");
		System.out.println("성별 : " + gender);
		
		String national = request.getParameter("national");
		System.out.println("국적 : " + national);
		
		String[] hobbies = request.getParameterValues("hobbies");
		
		for(String hobby : hobbies) {
			System.out.println("취미 : " + hobby);
		}
	}

}
