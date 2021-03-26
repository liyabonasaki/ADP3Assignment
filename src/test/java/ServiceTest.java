import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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

    }
}