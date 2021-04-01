package za.ac.cput_adp3;

/**
 * This is my small program
 * @author 214234169
 */

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.*;


    class EmployeeTest {
        private Employee emp1;
        private Employee emp2;
        private Employee emp3;

        @BeforeEach
        void setUp() {
            Employee emp1 = new Employee();
            Employee emp2 = new Employee();
            Employee emp3 = new Employee();
        }

        @Test
        void testIdentity() {
            assertSame(emp1, emp2);
        }

        @Test
        void testEquality() {
            assertEquals(emp1, emp2);
        }

        @Test
        void testFail() {
            fail("This test is meant to fail...");
        }

        @Timeout(3)
        @Test
        void testTimeout() {
            assertEquals(emp1, emp3);
        }

        @Disabled()
        @Test
        void TestDisabled() {
            assertEquals(emp1, emp3);
            System.out.println("Terminated by @214234169");
        }
    }

