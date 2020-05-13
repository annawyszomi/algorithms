package algorithms.binarySearch;

public class App {
    //data must be sorted
    //divide data by 2 in every iteration
    public static void main(String[] args) {
        System.out.println(binarySearch(1, new int[]{1, 3, 5, 7, 8, 9}));
    }

    public static int binarySearch(int x, int[] a) {
        int p = 0;
        int r = a.length - 1;
        int q;

        while (p <= r) {
            q = (p + r) / 2;
            if (a[q] == x) {
                return q;
            }
            if (a[q] > x) {
                r = q - 1;
            } else {
                p = q + 1;

            }
        }

        return -1;
    }
}
