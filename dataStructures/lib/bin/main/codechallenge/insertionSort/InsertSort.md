# Insertion Sort

Insertion sort is a sorting algorithm that works by building a sorted list one element at a time. It's similar to the way most people arrange a hand of playing cards. In this blog, I'll try to break down the insertion sort algorithm using a visual step-by-step guide for a better understanding, yours and mines.

## Pseudocode

The algorithm consists of two main procedures:

Insert(): Inserts a value into an already sorted array (helper method).
InsertionSort(): Uses Insert() to sort the entire array.

The pseudocode follows:

```pseudo
Insert(int[] sorted, int value)
initialize i to 0
WHILE value > sorted[i]
set i to i + 1
WHILE i < sorted.length
set temp to sorted[i]
set sorted[i] to value
set value to temp
set i to i + 1
append value to sorted

InsertionSort(int[] input)
LET sorted = New Empty Array
sorted[0] = input[0]
FOR i from 1 up to input.length
Insert(sorted, input[i])
return sorted
```

## Visual Step-by-Step - Trace

Example Input Array

```
[8, 4, 23, 42, 16, 15]
```

i = 1
Start with the first element (8), place it in the sorted list:
This corresponds to the line sorted[0] = input[0] in the pseudocode.

```
Sorted: [8]
```

i = 2
This is the next iteration of the FOR loop where i is 1. So, Insert([8], 4):

```
Next element is 4
Insert 4 into [8]
```
Now the code enters the while loop, where it checks the current sorted list to find where to place the 4. Since 4 is not greater than the first and only value in sorted (which is 8), it makes room for the 4 to be placed in front of the 8 by using temp, sorted, and value in the second while loop.

```
Compare with 8
Place 4 before 8
Sorted: [4, 8]
```

i = 3
In the next iteration, the value 23 is inserted. 

```
Next element is 23
Insert 23 into [4,8]
```

i = 3
Compare with 4, Compare with 8; Both comparisons come from the initial WHILE loop, trying to find the correct position for 23. The value 23 is placed in its correct position by the second WHILE loop.

```
Compare with 4
Compare with 8
Place 23 after 8
Sorted: [4, 8, 23]
```

i = 4
Continuing with 42:

```
Insert 42 into [4,8,23]
```

When the next element 42 is up for insertion, it starts by comparing it with the elements already in the sorted list. 42 first gets compared with 4. Since 42 is greater than 4, we move on to the next comparison. It is then compared with 8 and then 23. In each of these comparisons, 42 is greater. As we've reached the end of the sorted list without finding a smaller element, 42 gets appended to the end.

```
Compare 42 with 4, 8, and 23
Place 42 after 23
Sorted: [4, 8, 23, 42]
```

i = 5
Continue with 16:
Now, we proceed with the value 16.

```
Insert 16 into [4,8,23,42]
```

16 is compared with 4, 8, and 23 in order. After the comparison with 23, it's clear that 16 is less than 23 but greater than 8, and should be inserted before 23.

```
Compare 16 with 4, 8, and 23
Place 16 before 23 and after 8
Sorted: [4, 8, 16, 23, 42]
```

i = 6
Finally, we reach the value 15.

```
Lastly, 15
Insert 15 into [4,8,16,23,42]
```

15 undergoes comparisons with 4, 8, 23, and 16 respectively. It is found that 15 should be placed just before 16.

```
Compare with 4, 8, 23, and 16
Place 15 before 16 and after 8
Sorted: [4, 8, 15, 16, 23, 42]
Final Result: [4, 8, 15, 16, 23, 42]
```

## Big O

Depending on how large the input is in worst case time could be O(n^2), lets say that if all the values are sorted in the wrong order you, and you have 10 values you could be checking all the values with each other to make the total checks 100 times.
For space used: TBD 
## Code

TBD

## References

[Insertion sort - Khan Academy](https://www.khanacademy.org/computing/computer-science/algorithms/insertion-sort/a/insertion-sort)
[Insertion sort - Free Code Camp](https://www.freecodecamp.org/news/insertion-sort-what-it-is-and-how-it-works/)