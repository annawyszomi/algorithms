package project;

public class GCD {

    public int greatestCommonDivisor(int num1, int num2) throws IllegalAccessException {
        int num = 1;
        if (num1 == 0 || num2 == 0) {
            throw new IllegalAccessException("Entered value can not equals 0");
        } else {
            for (int i = 1; i <= num1; i++) {
                if (num1 % i == 0 && num2 % i == 0) {
                    num = i;
                }
            }
            System.out.println(num);
            return num;
        }
    }

    int gcdByEuclidsAlgorithm(int num1, int num2) throws IllegalAccessException {
        if (num2 == 0) {
            return num1;
        }
            return gcdByEuclidsAlgorithm(num2, num1 % num2);
    }
}
