package project;

public class FibonacciNumber {

    // iteracyjne wywołanie metody
    public void fibonacci1(int iteration) {
        int nr1 = 1;
        int nr2 = 1;
        int nr3;

        //     System.out.println(nr1 + "\n" + nr2);
        for (int i = 1; i <= iteration; i++) {
            if (i == 1 || i == 2) {

                System.out.println(i + " value equals 1 ");
            } else {
                nr3 = nr2 + nr1;
                System.out.println(i + " value equals " + nr3);
                nr1 = nr2;
                nr2 = nr3;
            }
        }
    }

    //rekurencyjne wywołanie metody
    public int fibonacci2(int n) {
        int value = 0;

        for (int i = 1; i <= n; i++) {
            if (n == 0 || n < 0) {
                value = 0;
            } else if (n == 1) {
                value = 1;
            } else {
                value = fibonacci2(n - 1) + fibonacci2(n - 2);
            }
        }

        return value;
    }


}
