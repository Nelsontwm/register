package com.nitya.register;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		response.setCharacterEncoding("utf-8");
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		String name2 =  (String) request.getSession().getAttribute("name");
		String word2 =  (String) request.getSession().getAttribute("word");
		
		PrintWriter out = response.getWriter();
		if(name2.equals(username)&&word2.equals(password)){
			out.print("欢迎"+username+"登陆成功"+"<br/>");
			out.print("<h1>游戏开始</h1>");
		}else {
			response.sendRedirect("/register/errow");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
//		request.setCharacterEncoding("utf-8");
//		response.setContentType("text/html;charset=utf-8");
//		response.setCharacterEncoding("utf-8");
//		
//		String username = request.getParameter("username");
//		String password = request.getParameter("password");
//		
//		
//		String name2 =  (String) request.getSession().getAttribute("name");
//		String word2 =  (String) request.getSession().getAttribute("word");
//		PrintWriter out = response.getWriter();
//		if("name2".equals(username)&&"word2".equals(password)){
//			out.print("欢迎"+username+"登陆成功"+"<br/>");
//			out.print("<h1>请开始你的表演</h1>");
//		}else {
//			response.sendRedirect("/register/errow");
//		}
	}

}
