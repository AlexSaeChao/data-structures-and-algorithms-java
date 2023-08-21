# Quick Sort

Quick sort is an efficient sorting algorithm that employs a divide-and-conquer strategy to sort lists or arrays. The
main principle behind Quick sort is partitioning the array and then sorting the partitions independently. This algorithm
is often likened to "divide and conquer" because it divides the larger problem into smaller, more manageable problems
and then conquers each of those smaller problems.

## Pseudocode

The algorithm primarily consists of two main functions:

1. **partition()**: This method selects a pivot and rearranges the elements, so elements less than the pivot come
   before, and elements greater than the pivot come after.
2. **quickSort()**: This is the main recursive function which applies the sorting on partitions.

The pseudocode follows:

```pseudo
quickSort(array, low, high)
IF low < high
    pivotLocation = partition(array, low, high)
    quickSort(array, low, pivotLocation - 1)
    quickSort(array, pivotLocation + 1, high)

partition(array, low, high)
SET pivot = array[high]
SET leftwall = low
FOR i = low TO high - 1
    IF array[i] <= pivot
        SWAP array[i] with array[leftwall]
        leftwall = leftwall + 1
SWAP array[leftwall] with array[high]
RETURN leftwall
```

## Visual Step-by-Step - Trace

Example Input Array:
```
[5, 2, 1, 4, 0, 3]
We start by selecting the last element 3 as the pivot.
```

Partitioning process:
```
Array: [5, 2, 1, 4, 0, 3]
low = 0, high = 4
Pivot = 3
```


Initial state:
```
5, 2, 1, 4, 0, 3
leftwall points at 5
```

i = 0:

5 is greater than 3, no change.

i = 1:

2 is less than 3, swap 2 with element at leftwall (which is 5), then move leftwall one position to the right.
```
[2, 5, 1, 4, 0, 3]
```

i = 2:

1 is less than 3, swap 1 with element at leftwall (which is 5), then move leftwall one position to the right.
```
[2, 1, 5, 4, 0, 3]


```
i = 3:
4 is greater than 3, no change.

i = 4:
0 is less than 3, swap 0 with element at leftwall (which is 5), then move leftwall one position to the right.

```
[2, 1, 0, 4, 5, 3]

```

End of loop:
Swap the pivot (3) with the element at leftwall (which is 5).
```
[2, 1, 0, 4, 3, 5]
```
The pivot 3 is now in its correct sorted position, and the partition method would return the index 2.

Apply quicksort on the left sub-array `[2, 1, 0]`.


Partitioning process for left sub-array:
```
Initial: [2, 1, 0]
```

Select the last element 0 as the pivot. After partitioning:
```
Swap 0 with 2: [0, 1, 2]
```
No more elements on the left of the pivot.

On the right, `[1, 2]` is already sorted.

Apply quicksort on the right sub-array `[5, 4]`:

Partitioning process for right sub-array:
```
Initial: [5, 4]
Swap 4 with 5: [4, 5]
```

Combining the results:
```
Final Result: [0, 1, 2, 3, 4, 5]
```

## Big O

### Worst-case time complexity:

O(n 2)This can happen when the smallest or largest element is always chosen as the pivot.

### Space complexity:

O(log n), because of the log(n) recursive calls.

## Code

``` Java
class Main {
  public static void main(String[] args) {
    int[] unsortedArr = {5, 2, 1, 4, 0, 3};
    System.out.println("unsorted array: " + java.util.Arrays.toString(unsortedArr));

    quickSort(unsortedArr, 0, unsortedArr.length - 1);
    
    System.out.println("sorted array: " + java.util.Arrays.toString(unsortedArr));
  }

  static void quickSort(int[] arr, int low, int high) {
    if(low < high) {
      int pivotLocation = partition(arr, low, high);
      quickSort(arr, low, pivotLocation - 1);
      quickSort(arr, pivotLocation + 1, high);
    }
  }

  static int partition(int[] arr, int low, int high) {
    int pivot = arr[high];
    int leftwall = low;
    
    for(int i = low; i < high; i++) {
      if(arr[i] <= pivot) {
        int temp = arr[i];
        arr[i] = arr[leftwall];
        arr[leftwall] = temp;
        leftwall+=1;
      }
    }

    int temp = arr[leftwall];
    arr[leftwall] = arr[high];
    arr[high] = temp;

    return leftwall;
  }
}
```

## References

[Java Program for QuickSort](https://www.geeksforgeeks.org/java-program-for-quicksort/)

[Quicksort Algorithm Implementation in Java](https://www.baeldung.com/java-quicksort)

[QuickSort - ReynaldoOliva](https://replit.com/@ReynaldoOliva/QuickSort#Main.java())