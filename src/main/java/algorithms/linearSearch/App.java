package algorithms.linearSearch;

public class App {

    public static void main(String[] args) {
        System.out.println(linearSearch(new int[]{1, 4, 5,3},3));
    }

    public static int linearSearch(int[] a, int x) {
        for (int i = 0; i < a.length ; i++) {
            if (a[i] == x) {
                return i;
            }
        }
        return -1;
    }
}
