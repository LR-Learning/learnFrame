package com.mybatis.jdbc;

import java.sql.*;

/**
 * @Author: LR
 * @Descriprition:
 * @Date: Created in 11:26 2018/7/8
 * @Modified By:
 **/
public class Demo1 {


    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            // 加载驱动
            Class.forName("com.mysql.jdbc.Driver");
            //创建连接
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mybatis?characterEncoding=utf-8", "root", "1234");
            // 设置SQL语句
            String sql = "select * from user where username = ?";
            // 编译预处理statement
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, "王五");
            // 想数据库中发出sql执行查询， 查询出结果集
            resultSet = preparedStatement.executeQuery();
            // 遍历查询结果集
            while (resultSet.next()){
                System.out.println(resultSet.getString("id") + ":" + resultSet.getString("username"));
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // 释放资源
            if (resultSet == null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (preparedStatement == null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (connection == null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
