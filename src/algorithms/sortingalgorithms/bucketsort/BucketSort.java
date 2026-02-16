package algorithms.sortingalgorithms.bucketsort;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

/**
 * Bucket Sort Algorithm
 * ----------------------
 * Distributes elements into various buckets and sorts
 * individual buckets using insertion sort
 * n is size of array, k is number of buckets
 * Time Complexity: Average O(n + k), Worst O(n^2)
 * Space Complexity: O(n + k)
 * Author: Trevin Fugere
 */
public class BucketSort {

      public static void insertionSort(List<Integer> bucket) {
        for (int i = 1; i < bucket.size(); i++) {
            int key = bucket.get(i);
            int j = i-1;
            while (j >= 0 && bucket.get(j) > key) {
                bucket.set(j + 1, bucket.get(j));
                j--;
            }
            bucket.set(j + 1, key);
        }
    }

    public static void bucketSort(int[] arr) {
        int n = arr.length;
        List<Integer>[] buckets = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            buckets[i] = new ArrayList<>();
        }

        int maxVal = arr[0];
        for (int i : arr) {
            if (i > maxVal) {
                maxVal = i;
            }

        }
        for (int i = 0; i < n; i++) {
            int bi = ((n-1)*arr[i]) / maxVal;
            buckets[bi].add(arr[i]);
        }

        for (int i = 0; i < n; i++) {
            insertionSort(buckets[i]);
        }

        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < buckets[i].size(); j++) {
                arr[index] = buckets[i].get(j);
                index++;

            }
        }
    }

  
    public static void main(String[] args) {
        int[] arr = {5, 8, 9, 1, 2, 6, 4};
        System.out.println("Before Bucket Sort:");
        printArray(arr);

        bucketSort(arr);

        System.out.println("After Bucket Sort:");
        printArray(arr);
    }

    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}