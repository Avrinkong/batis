package com.it.main;

import com.it.utils.Dbinfo;

import java.sql.Connection;
import java.sql.DriverManager;


public class annotationTest {
    @Dbinfo( url="jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=UTF-8", drivername="com.mysql.jdbc.Driver",username="root" , password="1234")
    public Connection getCon(String url, String drivername, String username, String password  ) throws Exception{
        Class.forName( drivername).newInstance();
        System.out.println(drivername);
        Connection con=null;
        if(url!=null&&username!=null&&password!=null){
        con=(Connection) DriverManager.getConnection( url, username, password);
        System.out.println(con);
        }
        return con;

    }
}

