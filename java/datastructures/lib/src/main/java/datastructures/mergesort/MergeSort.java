package datastructures.mergesort;

import java.util.Arrays;

public class MergeSort {
  public static int[] mergeSort(int[] input){
    int n = input.length;

    if(n > 1){
      int mid = n/2;
      int[] left = Arrays.copyOfRange(input, 0, mid);
      int[] right = Arrays.copyOfRange(input, mid, input.length);

      mergeSort(left);
      mergeSort(right);
      merge(left, right, input);
    }
    return input;

  }

  public static void merge(int[] left, int[] right, int[] arr){
    int i = 0;
    int j = 0;
    int k = 0;

    while (i < left.length && j < right.length){
      if (left[i] <= right[j]){
        arr[k] = left[i];
        i++;
      } else {
        arr[k] = right[j];
        j++;
      }
      k++;
    }
    if (i == left.length){
      while(k < arr.length){
        arr[k] = right[j];
        k++;
        j++;
      }
    } else {
          while (k < arr.length){
            arr[k] = left[i];
            i++;
            k++;
      }
    }
  }
}
