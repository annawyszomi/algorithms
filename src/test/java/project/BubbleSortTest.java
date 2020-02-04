package project;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class BubbleSortTest {
    BubbleSort bubbleSort = new BubbleSort();

    @Test
    public void bubbleSort1(){
      assertTrue(Arrays.equals(new int[]{3, 4, 7, 9},bubbleSort.bubbleSort(new int[]{7,9,3,4})));
    }

    @Test
    public void bubbleSort2(){
        assertTrue(Arrays.equals(new int[]{0},bubbleSort.bubbleSort(new int[]{0})));
    }

    @Test
    public void bubbleSort3(){
        assertTrue(Arrays.equals(new int[]{0,0,0,1,2,4,8},bubbleSort.bubbleSort(new int[]{0,1,8,4,2,0,0})));
    }

}
