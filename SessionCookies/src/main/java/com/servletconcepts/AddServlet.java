package com.servletconcepts;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;



public class AddServlet extends HttpServlet{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		int k = i+j;
		
		//cookie
		Cookie cookie = new Cookie("k",k+"");
		res.addCookie(cookie);
		//session Management - to send data from one servlet to other servlet
//		HttpSession session = req.getSession();
//		session.setAttribute("k", k);
//		res.sendRedirect("sq");
//		res.sendRedirect("sq?k="+k);

//		RequestDispatcher rd = req.getRequestDispatcher("sq");
//		rd.forward(req,res);
	}
}
