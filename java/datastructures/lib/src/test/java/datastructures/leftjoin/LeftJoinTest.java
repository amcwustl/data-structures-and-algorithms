package datastructures.leftjoin;


import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;


public class LeftJoinTest {

  @Test
  public void testLeftJoinWithMatchingKeys() {
    HashMap<String, String> left = new HashMap<>();
    left.put("key1", "value1");
    left.put("key2", "value2");

    HashMap<String, String> right = new HashMap<>();
    right.put("key1", "rightValue1");

    String[][] result = LeftJoin.leftJoin(left, right);

    assertEquals(2, result.length);
    assertArrayEquals(new String[]{"key1", "value1", "rightValue1"}, result[0]);
    assertArrayEquals(new String[]{"key2", "value2", "NULL"}, result[1]);
  }

  @Test
  public void testLeftJoinWithNoMatchingKeys() {
    HashMap<String, String> left = new HashMap<>();
    left.put("key1", "value1");
    left.put("key2", "value2");

    HashMap<String, String> right = new HashMap<>();
    right.put("key3", "rightValue3");

    String[][] result = LeftJoin.leftJoin(left, right);

    assertEquals(2, result.length);
    assertArrayEquals(new String[]{"key1", "value1", "NULL"}, result[0]);
    assertArrayEquals(new String[]{"key2", "value2", "NULL"}, result[1]);
  }

  @Test
  public void testLeftJoinWithEmptyLeftMap() {
    HashMap<String, String> left = new HashMap<>();
    HashMap<String, String> right = new HashMap<>();
    right.put("key1", "rightValue1");

    String[][] result = LeftJoin.leftJoin(left, right);

    assertNull(result);
  }
}
