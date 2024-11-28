package topic_6_sorting;

import java.util.ArrayList;
import java.util.Scanner;

public class QuickSort {

    public static void quickSort(ArrayList<Integer> arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

}

