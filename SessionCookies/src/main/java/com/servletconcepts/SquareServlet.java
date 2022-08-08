package com.servletconcepts;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class SquareServlet extends HttpServlet{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
		int kcookie = 0;
		Cookie cookies[] = req.getCookies();
		
		for(Cookie c: cookies) {
			if(c.getName().equals("k")) {
				kcookie = Integer.parseInt(c.getValue());
			}
		}
		HttpSession session = req.getSession();
		int k = (int)session.getAttribute("k");
		
		k = k*k;
		PrintWriter out = res.getWriter();
		out.println("Result is "+k);
		
		PrintWriter out2 = res.getWriter();
		out2.println("Cookie Result is "+kcookie);

	}
}
