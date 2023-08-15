# Merge Sort

Merge sort is a powerful "divide and conquer" algorithm that splits a list into two halves, recursively sorts those halves, and then merges them back together. It's a go-to choice for many sorting needs. In this article, let's dive deep into the mechanics of merge sort with a visual guide.

## Pseudocode

The algorithm is primarily split into two main procedures:

Mergesort(): Recursively splits and sorts the array.
Merge(): Merges two sorted arrays into one sorted array.

Here's the pseudocode for both:

``` pseudo
Mergesort(arr)
DECLARE n = arr.length
if n > 1
    DECLARE mid = n/2
    DECLARE left = arr[0...mid]
    DECLARE right = arr[mid...n]
    Mergesort(left)
    Mergesort(right)
    Merge(left, right, arr)

Merge(left, right, arr)
DECLARE i = 0, j = 0, k = 0
WHILE i < left.length && j < right.length
    if left[i] <= right[j]
        arr[k] = left[i]
        i = i + 1
    else
        arr[k] = right[j]
        j = j + 1
    k = k + 1
if i = left.length
    WHILE j < right.length
        arr[k] = right[j]
        k = k + 1
        j = j + 1
else
    WHILE i < left.length
        arr[k] = left[i]
        k = k + 1
        i = i + 1
```

## Visual Step-by-Step - Trace

We're going to be starting with this Input array for our demo.

```
Example Input Array:
[8, 4, 23, 42, 16, 15]
```

Initial Split: 'n' is in set to the array length, then it checks if 'n' is greater than 1 then split n in half. Gather the range needed to define be the left and right arrays. Then calls the mergesort procedure (divides and sorts) in their respect left and right arrays recursively.

```
The array is split into two halves:
[8, 4, 23] and [42, 16, 15]
```

Recursive Spliting: This is the mergesort(left) holding the first half of the original input array. it's going to try and split it in half once more.

```
The process is recursively applied to each half. Breaking down the first half [8, 4, 23]:
[8] and [4, 23]
```

Recursive Spliting: again then first merge of the sub arrays: mergesort(left) on this run halves the array of [8, 4, 23], 8 is by itself so it should be considered as sorted. So we begin mergesort(right) of the array of [4, 23] turning htem into single-element arrays like [8].
Running the merge method procedure now we have a left and a right, and an array to place the elements in the while loop as arguements for merge(). The while loops kicks off and compare the values of the both left[i] and right[j] arrays, and places the lesser value into the new array at the arr[k]. 4 is less than 23, so it gets placed into array[0], i increments, then k increments awaiting for the next value to be placed. since array(left) is now empty it will place 23 at array[1] k then increments then j.

```
[8] is already sorted. Now, we split [4, 23]:
[4] and [23]
Both are single-element arrays, so they're inherently sorted.
```

Second merging: Now we merge again, but now we have an array(left) with the single element of [8] and an array(right) with elements of [4, 23].

```
Merging the sorted arrays:
[8] and [4, 23]
```

Third merging of original subarray(left): Compares left and right (8 and 4). 4 is less so it places the value of 4 in the array[0] then compares 8 with 23, which 8 is less than 23. 8 is then added into the array[1]. Array(left) is now empty so it will place the remaining elements to the next open array index (array[2]). Resulting in an array of [4, 8, 23]

```
Results are in:
[4, 8, 23]
```

Recursive Splitting of subarray(right): This is the mergesort(right) holding the right half of the original input array.

```
Following the same process for the second half [42, 16, 15]:
[42] and [16, 15]
```

Split 16 and 15, they are now single-element arrays, they go to merging process. Checks if 16 is less than 15 which is false so it places 15 into a new array at array[0]. Then array(right) is empty, and places the remaining array(left) elements in order.

```
Splitting [16, 15]:
[16] and [15]
[15, 16]
```

Stepping back up a level, we now try to merge this instance of array(left) and array(right). Checks if 42 is less than 15. It is not, so 15 gets placed into another array at array[0]. Checks if 42 is less than 16, that is false, so it places 16 into the same array at index 1. Array(right) is now empty, places 42 into the next index of the array at index 2.

```
Merging the sorted arrays:
[42] and [15, 16]
```

Resulting in an array of [15, 16, 42]

```
Results in:
[15, 16, 42]
```

Now were nearing the end. In this final instance, We check if 4 is less than 15, it is. Places 4 into the new array at array[0]. Check if 8 is less than 15. That is true, 8 is then place in the next index of the array. Next Check 23 less than 15, which is false. 15 then gets placed at array[2]. Checking 23 is less than 16, still false. Places 16 in the array at array[3]. Checks 23 is less than 42, it's true. Placing 23 in the array at array[4]. Array(left) is now empty and will now place the remaining elements from array(right) in order.

```
Finally, merging the two sorted halves:
[4, 8, 23] and [15, 16, 42]
```

Final Merge: Resulting in the final array [4, 8, 15, 16, 23, 42]

```
Gives the final sorted array:
[4, 8, 15, 16, 23, 42]
```

## Big O

Time Complexity: O(n log (n)) — This is because the list is divided in half with each recursive call, and then each of those halves is processed in linear time O(n) when merged.

Space Complexity: O(n) — Additional space is required for the left and right sub-arrays during the merge process. Keeping in mind that although each recursive level of the merge sort creates new subarrays, these arrays do not all exist simultaneously.

## Code

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

## References

[Merge Sort – Data Structure and Algorithms Tutorials](https://www.geeksforgeeks.org/merge-sort/)

[What is more efficient: System.arraycopy or Arrays.copyOf?](https://stackoverflow.com/questions/2589741/what-is-more-efficient-system-arraycopy-or-arrays-copyof)