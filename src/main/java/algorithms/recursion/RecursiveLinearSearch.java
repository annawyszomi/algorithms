package algorithms.recursion;

public class RecursiveLinearSearch {
    public static void main(String[] args) {
     //   recursiveLinearSearch(new int[]{3,6,7,10,4,15,27},0,15);
        System.out.println(recursiveLinearSearch(new int[]{3,6,7,10,4,15,27},0,15));
    }

    public static int recursiveLinearSearch(int[] a, int i, int x) {

        if (i > a.length - 1) {
            return -1;
        } else if (a[i] == x) {
            return i;
        } else {
            System.out.println("index at: " + i);
            return recursiveLinearSearch(a, i + 1, x);
        }
    }
}