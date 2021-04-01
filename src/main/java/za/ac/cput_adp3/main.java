package za.ac.cput_adp3;/*
    @Author : 217120830
    @Ver    : 1.0
    @Descr  : Adp3 Assignment

     */


import za.ac.cput_adp3.Connection_impl;

public class main {

    public static void main(String[] args) {

       Connection_impl con = new Connection_impl();
       con.connect_to_server();

    }
}
