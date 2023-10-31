package com.xxxx.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class GetSqlSession {
    //        加载核心配置文件获取sqlsessionFactory
    public static SqlSession createSqlSession() {
        try {
            String resource = "mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);


            return sqlSessionFactory.openSession();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }

    }
        public static void main (String[] args){
            System.out.println(createSqlSession());
        }
    }
