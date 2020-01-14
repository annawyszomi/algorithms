package project;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GCDTest {

    GCD gcd = new GCD();

    @Test
    public void isGCDof10and12equals2() throws IllegalAccessException {
        assertEquals(2, gcd.greatestCommonDivisor(10,12));
    }

    @Test
    public void isGCDof500and100equals100() throws IllegalAccessException {
        assertEquals(100, gcd.greatestCommonDivisor(500,100));
    }

    @Test
    public void isGCDof1111and2222equals1111() throws IllegalAccessException {
        assertEquals(1111, gcd.greatestCommonDivisor(1111,2222));
    }
    @Test
    public void isGCDof2222and1111equals1111() throws IllegalAccessException {
        assertEquals(1111, gcd.greatestCommonDivisor(1111,2222));
    }

    @Test
    public void isGCDof2and2equals2() throws IllegalAccessException {
        assertEquals(2, gcd.greatestCommonDivisor(2,2));
    }
    @Test
    public void isGCDof3and2equals1() throws IllegalAccessException {
        assertEquals(1, gcd.greatestCommonDivisor(3,2));
    }

    @Test
    public void isNotGCDof5and3equals3() throws IllegalAccessException {
        assertNotEquals(3,gcd.greatestCommonDivisor(5,3));
    }

    @Test
    public void isGCDByEuclidsAlgorithmOf100and56equals50() throws IllegalAccessException {
        assertEquals(4,gcd.gcdByEuclidsAlgorithm(100,56));
    }
}
