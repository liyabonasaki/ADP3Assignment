/*
  BookTest.java
  This is my Assignment 1 program to do tests and git functions
  @author Bilqees Saban (219090866)
 */

package za.ac.cput_adp3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.*;

class BookTest
{
    private Book book1;
    private Book book2;
    private Book book3;

    @BeforeEach
    void setUp()
    {
        Book book1 = new Book();
        Book book2 = new Book();
        Book book3 = new Book();
    }

    @Test
    void testIdentity()
    {
        assertSame(book1, book2);
    }

    @Test
    void testEquality()
    {
        assertEquals(book1, book2);
    }

    @Test
    void testFail()
    {
        fail("This test was built to fail...");
    }

    @Timeout(3)
    @Test
    void testTimeout()
    {
        assertEquals(book1, book3);
    }

    @Disabled()
    @Test
    void TestDisabled()
    {
        assertEquals(book1, book3);
        System.out.println("Disabled by Bilqees Saban");
    }
}