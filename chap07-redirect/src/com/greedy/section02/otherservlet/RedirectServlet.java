package com.greedy.section02.otherservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/redirect")
public class RedirectServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("이 서블릿으로 redirect 성공");
		
		StringBuilder redirectText = new StringBuilder();
		redirectText.append("<!doctype html>\n")
					.append("<head>\n")
					.append("</head>\n")
					.append("<body>\n")
					.append("<h1>이 서블릿으로 redirect 성공!</h1>")
					.append("</body>\n")
					.append("</html\n");
		
		response.setContentType("text/html; charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		
		out.print(redirectText.toString());
		
		out.flush();
		out.close();
		
		
		
	}

}
