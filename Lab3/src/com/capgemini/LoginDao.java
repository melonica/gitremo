package com.capgemini;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LoginDao {
    public int checkLogin(String username, String password) {
        try {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe","hr","hr");
        Statement st=conn.createStatement();
        String query="Select * from logintable where username='"+username+"'and pass='"+password+"'";
        System.out.println(query);
        ResultSet rs=st.executeQuery(query);
        if(rs.next()) {
            return 1;
        }else {
            return 0;
        }
    } catch(ClassNotFoundException | SQLException e) {
        e.printStackTrace();
    }
     return 0;
}
}