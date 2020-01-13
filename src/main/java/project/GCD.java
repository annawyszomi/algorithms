package project;

public class GCD {

    public int GreatestCommonDivisor(int num1, int num2) {
        int num=0;
        if (num1 != 0 && num2 != 0) {
            for (int i = 1; i <= num1; i++) {
                if (num1 % i == 0 && num2 % i == 0) {
                    num = i;
                }
            }
        }
        System.out.println(num);
        return num;
    }
}
