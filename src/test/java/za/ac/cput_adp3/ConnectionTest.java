package za.ac.cput_adp3;/*
    @Author : 217120830
    @Ver    : 1.0
    @Descr  : Adp3 Assignment

     */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConnectionTest {

    private Connection con1;
    private Connection con2;

    @BeforeEach
    void setUp() {
        con1 = new Connection() {
            @Override
            public void connect_to_server() {

            }
        };

        con2 = new Connection() {
            @Override
            public void connect_to_server() {

            }
        };
    }

    @AfterEach
    void tearDown() {


    }

    @Test
    void testNotIdentity(){
        assertNotSame(con1 ,con2);
    }

    @Disabled
//  con2 cannot connect to server
    void diabledTest(){
       assertNotNull(con2);
    }
}