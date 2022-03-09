package com.greedy.section01.cookie;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cookie")
public class CookieHandlerServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		
		System.out.println("firstName : " + firstName);
		System.out.println("lastName : " + lastName);
		
		response.sendRedirect("redirect");
	}

}
