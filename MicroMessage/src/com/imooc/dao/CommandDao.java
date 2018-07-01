package com.imooc.dao;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.imooc.bean.Command;
import com.imooc.bean.Message;
import com.imooc.db.DBAccess;

// 与指令表对应的数据库操作
public class CommandDao {
	//根据查询条件指令列表 -- 使用mybatis重写
	public List<Command> queryCommandList(String name, String description){
		DBAccess dbAccess = new DBAccess();
		SqlSession sqlSession = null;
		
		List<Command> commandList = new ArrayList<Command>();
		try {
			sqlSession = dbAccess.getSqlSession();
			//执行SQL语句
			Command command = new Command();
			command.setName(name);
			command.setDescription(description);
			
			commandList = sqlSession.selectList("Command.queryCommandList", command);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(sqlSession!=null){
				sqlSession.close();
			}
		}
		return commandList;
	}

}
