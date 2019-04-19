package com.it.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MybatisUtil {
    //创建SqlsessionFactory工厂
    public static SqlSessionFactory sqlSessionFactory;
        static {
            try {
                //读取myBatis-config.xml输入流
                InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
                //工厂读取配置文件
                sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //创建SqlSession对象
     public static SqlSession createSqlSession(){
            return sqlSessionFactory.openSession();
     }

         //关闭SqlSession 释放资源
     public static void closeSqlSession(SqlSession sqlSession){
         if (sqlSession != null) {
             sqlSession.close();
         }
     }
}
