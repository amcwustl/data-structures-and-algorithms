package quicksort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static quicksort.QuickSort.*;


public class QuickSortTest {

  @Test
  public void quickSortTest() {
    int[] testArr = {8, 4, 23, 42, 16, 15};
    quickSort(testArr,0,testArr.length-1);
    for(int num : testArr){
      System.out.println(num);
    }
    int[] expected = {4, 8, 15, 16, 23, 42};

    assertArrayEquals(expected, testArr);
  }
}
