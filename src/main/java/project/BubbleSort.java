package project;

import java.util.Arrays;

public class BubbleSort {

    public int[] bubbleSort(int[] tab) {
        int[] result;

        for (int i = 0; i < tab.length - 1; i++) {
            for (int j = 0; j < tab.length - 1; j++) {
                if (tab[j] > tab[j + 1]) {
                    int temp = tab[j];
                    tab[j] = tab[j + 1];
                    tab[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i] + " ");
        }
        return tab;
    }
}


