package project;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class ReverseArrayTest {

    ReverseArray reverseArray = new ReverseArray();

    @Test
    public void setReverseArray(){
        assertTrue(Arrays.equals(new int[]{4,3,2,1}, reverseArray.reverse(new int[]{1,2,3,4})));
    }

    @Test
    public void setReverseArray2(){
        assertTrue(Arrays.equals(new int[]{0,11,43,1},reverseArray.reverse(new int[]{1,43,11,0})));
    }
}
