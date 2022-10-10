package com.servlets.sm;

import java.io.*;

import javax.servlet.http.*;

public class SourceServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

		Cookie[] cookies = request.getCookies();
		if (cookies != null) {
			for (int i = 0; i < cookies.length; i++) {
				System.out.println(cookies[i].getName());
				System.out.println(cookies[i].getValue());
			}
		}
		response.addCookie(new Cookie("tokenx", "12345"));

		String userName = request.getParameter("userName");
		HttpSession session = request.getSession();
		session.setAttribute("user", userName);
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String url = "targetServlet?sessionId=123";
		out.print("<a href='" + url + "'>Click here to get the user name <a/>");

	}

}
