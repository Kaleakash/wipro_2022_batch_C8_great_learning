package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Demo
 */
public class Demo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Demo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("Welcome to Simple Servlet PRogram");		// it display the output in server console. 
		PrintWriter pw = response.getWriter();
		pw.println("Welcome to Server PRogram client....");			// it will display the output on client browser. 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		PrintWriter pw = response.getWriter();
		String email = request.getParameter("email");	// it is use to receive the email field. 
		String password = request.getParameter("password");
		/*
		 * 	do with JDBC to check the check email and password from database. 
		 * 
		 */
		RequestDispatcher rd1 = request.getRequestDispatcher("Home");  // Home is URL pattern of servlet 
		RequestDispatcher rd2 = request.getRequestDispatcher("index.html");  // html page we have to give name.html 
		if(email.equals("raj@gmail.com") && password.equals("123")) {
			pw.println("successfully login");
			rd1.forward(request, response);				// we will get the output of only target page. 
		}else {
			pw.println("failure try once again<br/>");
			rd2.include(request, response);				// source + target page as one page. 
		}
	}

}
