# Merge Sort

Merge Sort is a classic divide-and-conquer algorithm. The main idea behind the algorithm is to divide the original list into smaller sublists until each sublist contains a single element and then merge those sublists in a sorted manner to produce new sorted lists. This process is recursively applied to each half of the list.

## Approach & Efficiency

Repeatedly splits a list in half until each piece has 1 item, then merges pieces back together in sorted order.

* Divide: If the list is of length 0 or 1, then it is already sorted. Otherwise, divide the unsorted list into two sublists of about half the size.
* Conquer (Recursively Sort): Recursively sort both sublists.
* Merge (Combine): Merge the two sorted sublists back into a single sorted list.

## Solution

``` java
public class MergeSortExample {

    public static void mergeSort(int[] arr) {
        int n = arr.length;
        if (n > 1) {
            int mid = n / 2;
            int[] left = new int[mid];
            int[] right = new int[n - mid];
            
            System.arraycopy(arr, 0, left, 0, mid);
            System.arraycopy(arr, mid, right, 0, n - mid);
            
            mergeSort(left);
            mergeSort(right);
            merge(left, right, arr);
        }
    }

    public static void merge(int[] left, int[] right, int[] arr) {
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < left.length) {
            arr[k] = left[i];
            k++;
            i++;
        }

        while (j < right.length) {
            arr[k] = right[j];
            k++;
            j++;
        }
    }
}
```
