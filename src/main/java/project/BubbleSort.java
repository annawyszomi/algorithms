package project;

public class BubbleSort {

    public int[] bubbleSort(int[] tab){
        int[] result;

        for (int i = 0; i < tab.length-1; i++) {
            if(tab[i]>tab[i+1] ){
                tab [i+1]=tab[i];
            }
        }

        return tab;
    }
}
