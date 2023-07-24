# PsuedoQueue
Write a function called `reverseArray` which takes an array as an argument. Without utilizing any of the built-in methods available to your language, return an array with elements in reversed order.

## Whiteboard Process
![Whiteboard](arrayReverse.png)

## Approach & Efficiency

Given our discussion in class, I decided to just copy the array in reverse to a new array.  I know that technically copying it in place by swapping the first index with the last and so on is half of the steps, the big O on time is still O(n) and I decided it was not worth complicating the code by creating a temporary value to allow for swapping.  This to me seemed the easiest and most readable solution even if I can think of a couple of solutions that would technically be more efficient on memory (reversing in place).
The big O on this algorithm will be O(n) as the number of steps to complete will scale linearly with the size of the input array.

## Solution
```java
public static int[] reverseArray(int[] Arr) {
    int n = Arr.length;
    int[] newArr = new int[n];
    for (int i = 0; i < n; i++) {
      newArr[i] = Arr[n - 1 - i];
    }
    return newArr;
  }
  ```
