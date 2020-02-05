package project;

public class OddNumber {


    public int oddNumber() {
        int nr = 1;
        System.out.println("Odd numbers from 0 to 100:");
        for (int i = 1; i < 100; i++) {
            if (nr % 2 == 1) {
                System.out.print(nr+", ");

            }
            nr++;
        }
        return nr;
    }
}
