package com.busycoder;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class S2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	private String email;
	   
    public S2() {
       System.out.println("ctr S2");
    }
    //						india		TN
    //						per app		per servlet/jsp
	//What is the meaning of context? config?
	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		email=config.getInitParameter("email");
		System.out.println("init S2");
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		out.print("hello all "+LocalDateTime.now());
		System.out.println("doGet method S2"+email);
	}

	
	
    
	@Override
	public void destroy() {
		System.out.println("destroy S2");
	}




}
