package mergesort;

import org.junit.jupiter.api.Test;

import static datastructures.mergesort.MergeSort.*;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

public class MergeSortTest {

  @Test
  public void insertSortTest() {
    int[] testArr = {8, 4, 23, 42, 16, 15};
    int[] actual = mergeSort(testArr);
    for(int num : actual){
      System.out.println(num);
    }
    int[] expected = {4, 8, 15, 16, 23, 42};
    assertArrayEquals(expected, actual);
  }

}
