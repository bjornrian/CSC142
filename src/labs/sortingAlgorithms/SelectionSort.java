package labs.sortingAlgorithms;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] list = new int[] { 7, 2, 8, 1, 14, 0 };
        int length = list.length;

        for (int i = 0; i < length - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < length; j++) {
                if (list[j] < list[min_idx]) {
                    min_idx = j;
                }
                int temp = list[min_idx];
                list[min_idx] = list[i];
                list[i] = temp;
            }
        }
        System.out.println(Arrays.toString(list));
    }
}
