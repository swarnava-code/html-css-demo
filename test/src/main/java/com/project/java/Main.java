package com.project.java;

import java.sql.*;

public class Main {
    static Connection connection = null;
    static String databaseName = "";
    static String url = "jdbc:mysql://localhost:3306/"+databaseName ;

    static String username = "root";
    static String password = "12345";

    public static void main(String[] args) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {

        //DriverManager.registerDriver(new com.);


        Class.forName("com.mysql.jdbc.Driver").newInstance();
        connection = DriverManager.getConnection(url, username, password);
        PreparedStatement ps =
                connection.prepareStatement("Insert INTO `new_schema1`.`my_table`(`name`)VALUES(`Swarna_Chakra`);");

        int status = ps.executeUpdate();

        if(status != 0){
            System.out.println("db connected, record inserted !!!");
        }

        int a = 24541541;
        System.out.println("Hello World"+a);




    }
}



