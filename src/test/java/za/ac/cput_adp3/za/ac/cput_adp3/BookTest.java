package za.ac.cput_adp3.za.ac.cput_adp3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class KanyaTest {
    private Book bok;
    private Book bk;
    private Book books;

    @Disabled
    @BeforeEach
    void setUp() {
        bok = new Book();
        bk = new Book();
        books = bok;

    }

    @Test
    void testEquality()
    {
        assertEquals(books, bok);
    }

    @Test
    public void testIdentity()
    {
        assertSame(books, bok);
    }

    @Test
    public void testFailure()
    {
        assertTrue(true);
    }

    @Test
    public void testTime()
    {

    }

}