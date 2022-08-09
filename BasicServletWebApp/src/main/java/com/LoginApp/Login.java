package com.LoginApp;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Login")
public class Login extends HttpServlet {
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {				
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		System.out.println(request.getParameter("username"));
		if(username.equalsIgnoreCase("shilpa")&&password.equalsIgnoreCase("shilpa")) {
			HttpSession session = request.getSession();
			session.setAttribute("username", "Shilpa");
			response.sendRedirect("welcome.jsp");
		}
		else {
			response.sendRedirect("Login.jsp");
		}
	}
}
