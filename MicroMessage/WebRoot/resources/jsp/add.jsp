<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'add.jsp' starting page</title>
    
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <div id="messageBox">
		<form action="<%=basePath %>addServlet" method="post">
		  <p align="center">指令名称：
		    <input type="text" name="command" size="50"/>
		  </p>
		  <p align="center">描述：
		  <input type="text" name="description" size="50" />
		  </p>
		  <p align="center">内容：</p>
		  <div align="center">
		  	<textarea name="content" id="content" rows="5" cols="40"></textarea>
		  </div>
		  <p align="center">
		    <input type="submit" value="提交" />
		    <input type="reset" value="重置" />
		  </p>
		  </form>
	</div>
  </body>
</html>