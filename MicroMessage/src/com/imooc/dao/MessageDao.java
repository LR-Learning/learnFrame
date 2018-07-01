package com.imooc.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.imooc.bean.Message;
import com.imooc.db.DBAccess;

// 和message表相关的数据库操作
public class MessageDao {
	//根据查询条件查询列表 -- 使用mybatis重写
	public List<Message> queryMessageList(Map<String, Object> parameter){
		DBAccess dbAccess = new DBAccess();
		SqlSession sqlSession = null;
		
		List<Message> messageList = new ArrayList<Message>();
		try {
			sqlSession = dbAccess.getSqlSession();
			//执行SQL语句
			IMessage imessage = sqlSession.getMapper(IMessage.class);
			messageList = imessage.queryMessageList(parameter);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(sqlSession!=null){
				sqlSession.close();
			}
		}
		return messageList;
	}
	public List<Message> queryMessageListByPage(Map<String,Object> parameter) {
		DBAccess dbAccess = new DBAccess();
		List<Message> messageList = new ArrayList<Message>();
		SqlSession sqlSession = null;
		try {
			sqlSession = dbAccess.getSqlSession();
			// 通过sqlSession执行SQL语句
			IMessage imessage = sqlSession.getMapper(IMessage.class);
			messageList = imessage.queryMessageListByPage(parameter);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(sqlSession != null) {
				sqlSession.close();
			}
		}
		return messageList;
	}
		
	// 删除单个元素
	public void deleteOne(int id){
		DBAccess dbAccess = new DBAccess();
		SqlSession sqlSession = null;
		try {
			sqlSession = dbAccess.getSqlSession();
			//执行SQL语句
			sqlSession.delete("Message.deleteOne", id);
			sqlSession.commit();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(sqlSession!=null){
				sqlSession.close();
			}
		}
	}
	
	// 批量元素
	public void deleteBatch(List<Integer> ids){
		DBAccess dbAccess = new DBAccess();
		SqlSession sqlSession = null;
		try {
			sqlSession = dbAccess.getSqlSession();
			//执行SQL语句
			sqlSession.delete("Message.deleteBatch", ids);
			sqlSession.commit();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(sqlSession!=null){
				sqlSession.close();
			}
		}
	}
	
	// 添加元素
	public void addMessage(Message message){
		DBAccess dbAccess = new DBAccess();
		SqlSession sqlSession = null;
		try {
			sqlSession = dbAccess.getSqlSession();
			//执行SQL语句
			sqlSession.insert("Message.addMessage", message);
			sqlSession.commit();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(sqlSession!=null){
				sqlSession.close();
			}
		}
	}
	
	// 根据查询条件查询消息列表的条数
	public int count(Message message) {
		DBAccess dbAccess = new DBAccess();
		SqlSession sqlSession = null;
		int result = 0;
		try {
			sqlSession = dbAccess.getSqlSession();
			// 通过sqlSession执行sql语句
			IMessage imessage = sqlSession.getMapper(IMessage.class);
			result = imessage.count(message);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(sqlSession != null) {
				sqlSession.close();
			}
		}
		return result;
	}
	
	
	//根据查询条件查询列表
//	public List<Message> queryMessageList(String command, String description){
//		List<Message> messageList = new ArrayList<Message>();
//		try {
//			Class.forName("com.mysql.jdbc.Driver"); // 注册驱动
//			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/micromessage", "root", "1234");
//		
//			StringBuilder sql = new StringBuilder("select id, command, description, content from message where 1=1"); // 不要使用*查询
//			List<String> paramList = new ArrayList<String>();
//			if(command!=null&&!"".equals(command.trim())){
//				sql.append(" and command=?");
//				paramList.add(command);
//			}
//			if(description!=null&&!"".equals(description.trim())){
//				sql.append(" and description like '%' ? '%'");
//				paramList.add(description);
//			}
//			PreparedStatement ps = conn.prepareStatement(sql.toString());
//			for (int i = 0; i < paramList.size(); i++) {
//				ps.setString(i+1, paramList.get(i));
//			}
//			ResultSet rs = ps.executeQuery(); // 执行sql语句并取值
//			
//			while(rs.next()){
//				Message message = new Message();
//				message.setId(rs.getString("id"));
//				message.setCommand(rs.getString("command"));
//				message.setDescription(rs.getString("description"));
//				message.setContent(rs.getString("content"));
//				messageList.add(message);	
//		}
//	} catch (ClassNotFoundException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	} catch (SQLException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//	return messageList;
//
//}
//	public static void main(String[] args) {
//		MessageDao messageDao = new MessageDao();
//		messageDao.queryMessageList("", "");
//	}
}
