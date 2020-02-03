package project;

public class ReverseArray {

    public int[] reverse(int[] arr) {
        int[]result = new int[arr.length-1];

        for (int i = 0; i < arr.length-1; i++) {
            result[i] = arr[(arr.length-1)-i];
        }

        return result;
    }


}
