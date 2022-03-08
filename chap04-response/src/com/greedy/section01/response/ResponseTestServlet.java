package com.greedy.section01.response;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/response")
public class ResponseTestServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//response.setContentType("text/plain");
		response.setContentType("text/html");
		
		System.out.println("default response encoding : " + response.getCharacterEncoding());
		
		response.setCharacterEncoding("UTF-8");
		System.out.println("changed response encoding : " + response.getCharacterEncoding());
		
		//response.setContentType("text/html; charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		
		StringBuilder responseBuilder = new StringBuilder();
		responseBuilder.append("<!doctype html>\n")
						.append("<html>\n")
					    .append("<head>\n")
					    .append("</head>\n")
					    .append("<body>\n")
					    .append("<h1>안녕 servlet response</h1>\n")
					    .append("</body>\n")
					    .append("</html>");
		
		out.print(responseBuilder.toString());
		
		out.flush();
		
		out.close();
		
	}

}
