package com.imooc.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.imooc.bean.Message;
import com.imooc.dao.MessageDao;
import com.imooc.service.MaintainService;
import com.imooc.service.QueryService;

public class AddServlet extends HttpServlet {


	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 设置编码
		request.setCharacterEncoding("UTF-8");
		
		// 接收页面的值
		String command = request.getParameter("command");
		String description = request.getParameter("description");
		String content = request.getParameter("content");
		
//		// 将值传给message
		Message message = new Message();
		message.setCommand(command);
		message.setDescription(description);
		message.setContent(content);
		
		MessageDao messageDao = new MessageDao();
		messageDao.addMessage(message);
		
		request.getRequestDispatcher("/listServlet").forward(request, response);
		
	
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
