package project;

import java.util.Scanner;

public class Exercises {

    public void displayingNameInSeparateLine(String name) {
        System.out.println("Hello " + "\n" + name);
    }

    public int sum(int a, int b) {
        return a + b;
    }

    public int multiplication(int a, int b) {
        return a * b;
    }

    public void inputAndDisplaySumAndMultiplication() {
        java.util.Scanner in = new Scanner(System.in);

        System.out.println("Input first number");
        int nr1 = in.nextInt();

        System.out.println("Input second number");
        int nr2 = in.nextInt();

        System.out.println(nr1 + " x " + nr2 + " = " + multiplication(nr1, nr2));
        System.out.println(nr1 + " + " + nr2 + " = " + sum(nr1, nr2));
    }


    public void christmasTree() {
        char stars = '*';

        int horizontal = 5;

        for (int i = 0; i < horizontal; i++) {
            for (int j = 0; j < horizontal * 2; j++) {
                if (j < (horizontal - i) || j > (horizontal + i)) {
                    System.out.print(" ");
                } else {
                    System.out.print(stars);
                }
            }
            System.out.println();
        }
    }

    public void loops() {
        char sign1 = '*';
        char sign2 = '#';

        int horizontal = 5;

        for (int i = 0; i < horizontal; i++) {
            System.out.print(sign1);
            for (int j = 0; j < horizontal; j++) {
                // if (j < (horizontal - i) || j > (horizontal + i)) {

                //} else {
                System.out.println(sign2);
                //}
            }
            System.out.println();
        }
    }
}
