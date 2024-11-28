package topic_6_sorting;

import java.util.ArrayList;
import java.util.Scanner;

public class MergeSort {

    public static void mergeSort(ArrayList<Integer> arr) {
        if (arr.size() < 2) {
            return;
        }

        int mid = arr.size() / 2;

        ArrayList<Integer> left = new ArrayList<>(arr.subList(0, mid));
        ArrayList<Integer> right = new ArrayList<>(arr.subList(mid, arr.size()));

        mergeSort(left);
        mergeSort(right);

      
    }
}



