package com.imooc.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.imooc.bean.Message;
import com.imooc.dao.MessageDao;
import com.imooc.entity.Page;
import com.imooc.service.QueryService;

// 列表初始化控制
public class ListServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 设置编码
		request.setCharacterEncoding("UTF-8");
//		// 接收页面的值
		String command = request.getParameter("command");
		String description = request.getParameter("description");
		String currentPage = request.getParameter("currentPage");
		
		// 创建分页对象
		Page page = new Page();
		Pattern pattern = Pattern.compile("[0-9]{1,9}");
		if(currentPage == null || !pattern.matcher(currentPage).matches()){
			page.setCurrentPage(1);
		}else{
			page.setCurrentPage(Integer.valueOf(currentPage));
		}
		QueryService listService = new QueryService();
		// 查询消息列表并传给页面
		request.setAttribute("messageList", listService.queryMessageListByPage(command, description, page));
		
//		// 向页面传值
		request.setAttribute("command", command);
		request.setAttribute("description", description);
		request.setAttribute("page", page);
//		QueryService listService = new QueryService();
//		request.setAttribute("messageList", listService.queryMessageList(command, description));
		
		request.getRequestDispatcher("/WEB-INF/jsp/back/list.jsp").forward(request, response);
		

	}


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	
	}

}
