package com.servlets.sm;

import java.io.*;

import javax.servlet.http.*;

public class TargetServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

		HttpSession session = request.getSession();
		String userName = (String) session.getAttribute("user");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.print("<h1>UserName is " + userName + "</h1>");

	}

}
