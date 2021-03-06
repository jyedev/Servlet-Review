package com.greedy.section01.xml;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

public class LifeCycleTestServlet extends HttpServlet {

	
	// 메소드 호출 횟수를 카운트하기 위한 용도의 필드
	private int initCount = 1;
	private int serviceCount = 1;
	private int destroyCount = 1;
	
	// 서블릿의 요청이 최초인 경우 한 번 동작하는 메소드 
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("xml 매핑 init() 메소드 호출 : " + initCount++);
		}
	
	//서블릿 컨테이너에 의해 호출되며 최초 요청시에는 init()이후에 동작하고, 두 번째 요청부터는 바로 service()를 호출
	@Override
    public void service(ServletRequest req, ServletResponse res)
            throws ServletException, IOException{
		System.out.println("xml 매핑 service() 메소드 호출 : " + serviceCount++);
		
	}
	
	//컨테이너가 종료될 때 호출되는 메소드이며 주로 자원을 반납하는 용도로 사용
	@Override
	public void destroy() {
		System.out.println("xml 매핑 destroy() 메소드 호출 : " + destroyCount++);
	}
}
