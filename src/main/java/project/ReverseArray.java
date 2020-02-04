package project;

import java.util.Arrays;

public class ReverseArray {

    public int[] reverse(int[] arr) {
        int[]result = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[(arr.length-1)-i];
        }
        System.out.println(Arrays.toString(result));
        return result;

    }


}
