package labs.sortingAlgorithms;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] list = new int[]{7, 2, 8, 1, 14, 0};
        int j;
        int key;

        for (int i = 1; i < list.length; i++) {
            key = list[i];
            j = i - 1;
            while(j >= 0 && list[j] > key) {
                list[j + 1] = list[j];
                j--;
            }
            list[j + 1] = key;
        }

        System.out.println(Arrays.toString(list));
    }
}
