package com.greedy.section01.servicemethod;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/request-service")
public class ServiceMethodServlet extends HttpServlet {

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		
		HttpServletRequest httpRequest = (HttpServletRequest) request;
		HttpServletResponse httpResponse = (HttpServletResponse) response;
		
		String httpMethod = httpRequest.getMethod();
		System.out.println("http method : " + httpMethod);
		
		if("GET".equals(httpMethod)) {
			doGet(httpRequest, httpResponse);
		} else if("POST".equals(httpMethod)) {
			doPost(httpRequest, httpResponse);
		}
		
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("GET요청을 처리할 메소드 호출됨");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("POST 요청을 처리할 메소드 호출됨");
	}

}
