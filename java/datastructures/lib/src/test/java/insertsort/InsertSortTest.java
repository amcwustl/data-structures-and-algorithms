package insertsort;

import org.junit.jupiter.api.Test;

import static insertsort.InsertionSort.InsertSort;
import static org.junit.jupiter.api.Assertions.*;

public class InsertSortTest {

  @Test
  public void insertSortTest() {
    int[] testArr = {8, 4, 23, 42, 16, 15};
    int[] actual = InsertSort(testArr);
    int[] expected = {4, 8, 15, 16, 23, 42};
    assertArrayEquals(expected, actual);

  }
}
