package project;

public class Scanner {

    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Set a length of the array");
        int amount = scanner.nextInt();

        int[] tab = new int[amount];

        for (int i = 0; i < tab.length; i++) {
            System.out.println("Set an element of the array");
            tab[i] = scanner.nextInt();
        }
    }
}
