package project;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GCDTest {

    GCD gcd = new GCD();

    @Test
    public void isGCDof10and12equals2() {
        assertEquals(2, gcd.GreatestCommonDivisor(10,12));
    }

    @Test
    public void isGCDof500and100equals100(){
        assertEquals(100, gcd.GreatestCommonDivisor(500,100));
    }

    @Test
    public void isGCDof1111and2222equals1111(){
        assertEquals(1111, gcd.GreatestCommonDivisor(1111,2222));
    }
    @Test
    public void isGCDof2222and1111equals1111(){
        assertEquals(1111, gcd.GreatestCommonDivisor(1111,2222));
    }

    @Test
    public void isGCDof2and2equals2(){
        assertEquals(2, gcd.GreatestCommonDivisor(2,2));
    }
    @Test
    public void isGCDof3and2equals1(){
        assertEquals(1, gcd.GreatestCommonDivisor(3,2));
    }

    @Test
    public void isNotGCDof5and3equals3(){
        assertNotEquals(3,gcd.GreatestCommonDivisor(5,3));
    }

}
