/*
    @Author : 217120830
    @Ver    : 1.0
    @Descr  : Adp3 Assignment

     */

import org.junit.jupiter.api.*;
import org.junit.platform.commons.JUnitException;

import java.sql.SQLOutput;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class ServiceTest {

    private Service serv1;
    private Service serv2;
    private Service serv3;


    @BeforeEach
    void setUp() {

        serv1 = new Service();
        serv2 = new Service();
        serv3 = new Service();
        serv1 = serv2;

    }

    @AfterEach
    void tearDown() {

    }
    @Test
    void testIdentity(){
        assertSame(serv1 , serv2);
    }

    @Test
    void testEquality(){
        assertEquals(serv1, serv2);

    }


    @Test
    void fail(){
        //test if serv2 connection is the same with server3 connection
        assertSame(serv2 , serv3);

    }

    @Test
    @Timeout(5)
    public void TimeoutTest() throws InterruptedException {

        TimeUnit.SECONDS.sleep(4);

        String [] servers  = {"serv1", "serv2", "serv3"};

            for (int i = 0 ; i < servers.length ; i++ ){
                if (servers != null){
                    System.out.println("Connecting...");
                    System.out.println("Connected");
                    System.out.println("Test passed");
                }else {
                    System.out.println("Time out --> cant open connection !!");
                }

            }

    }

}