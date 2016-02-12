package com.it.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class accessWebTimes extends HttpServlet {

	

	@Override
	public void init() throws ServletException {
		
		// initialize
		getServletContext().setAttribute("times", 0);
		
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		
		int time = (Integer) getServletContext().getAttribute("times");
		time++;
		getServletContext().setAttribute("times", time);
		
		/
		response.setContentType("text/html; charset=utf-8");
		response.getWriter().print("You are the" + time + "st visitor");
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}


}
