package datastructures.hashmap;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class HashMapTest {

  private HashMap<String, Integer> hashMap;

  @BeforeEach
  public void setup(){
    hashMap = new HashMap<>(16);
  }

  @Test
  @DisplayName("Test set method")
  public void testSet(){
    hashMap.set("key1", 1);
    hashMap.set("key2", 2);

    assertEquals(1, hashMap.get("key1"));
    assertEquals(2, hashMap.get("key2"));
  }

  @Test
  @DisplayName("Test get method")
  public void testGet(){
    hashMap.set("key1", 1);

    assertEquals(1, hashMap.get("key1"));
    assertNull(hashMap.get("some other key"));
  }

  @Test
  @DisplayName("Test contains method")
  public void testContains(){
    hashMap.set("key1", 1);

    assertTrue(hashMap.contains("key1"));
    assertFalse(hashMap.contains("key7"));
  }

  @Test
  @DisplayName("Test keys method")
  public void testKeys(){
    hashMap.set("key1", 1);
    hashMap.set("key2", 2);

    List<String> keys = hashMap.keys();

    assertTrue(keys.contains("key1"));
    assertTrue(keys.contains("key2"));
    assertFalse(keys.contains("nonExistentKey"));

  }


}
