package com.imooc.service;

import java.util.ArrayList;
import java.util.List;

import com.imooc.bean.Message;
import com.imooc.dao.MessageDao;

// 维护相关业务功能
public class MaintainService {
	// 删除单个元素
	public void deleteOne(String id){
		MessageDao messageDao = new MessageDao();
		if(id!=null&&!"".equals(id.trim())){
			messageDao.deleteOne(Integer.valueOf(id));
		}	
	}
	
	// 批量删除元素
	public void deleteBatch(String[] ids){
		MessageDao messageDao = new MessageDao();
		if(ids!=null&&ids.length>1){
		List<Integer> idList = new ArrayList<Integer>();
		for (String id : ids) {
			idList.add(Integer.valueOf(id));
		}
	    messageDao.deleteBatch(idList);
		}
	}
	// 增加元素
	

}
