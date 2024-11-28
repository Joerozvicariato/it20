package topic_6_sorting;

import java.util.ArrayList;
import java.util.Scanner;

public class SelectionSort {

    public static void selectionSort(ArrayList<Integer> arr) {
        int n = arr.size();
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr.get(j) < arr.get(minIndex)) {
                    minIndex = j;
                }
            }
        }
    }
}
