package za.ac.cput_adp3;/*
    @Author : 217120830
    @Ver    : 1.0
    @Descr  : Adp3 Assignment

     */

import za.ac.cput_adp3.Connection;

import java.sql.DriverManager;

public class Connection_impl implements Connection {

    @Override
    public void connect_to_server() {

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/ADP3_Assignment","root","");
            con.connect_to_server();
            System.out.println("Connected succesful ");

        }catch(Exception e){
            System.out.println("Cant connect to servers");
            System.out.println(e.getStackTrace());
        }

    }

}
