package za.ac.cput;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class KanyaTest {
    private Kanya kimK;
    private Kanya dean;
    private Kanya buko;

    @Disabled
    @BeforeEach
    void setUp() {
        kimK = new Kanya();
        dean = new Kanya();
        buko = kimK;

    }

    @Test
    void testEquality()
    {
        assertEquals(kimK, buko);
    }

    @Test
    public void testIdentity()
    {
        assertSame(buko, kimK);
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