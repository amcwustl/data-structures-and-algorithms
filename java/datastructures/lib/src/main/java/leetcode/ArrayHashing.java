package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class ArrayHashing {

//  Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

  public boolean containsDuplicates(int[] nums) {
    HashSet<Integer> hashSet =  new HashSet<>();

    for (int i : nums) {
      if(hashSet.contains(i)){
        return true;
      } else {
        hashSet.add(i);
      }
    }
    return false;
  }

  public int[] twoSum(int[] nums, int target) {
    HashMap<Integer, Integer> hashMap = new HashMap<>();
    for (int i = 0; i < nums.length; i++){
      int pairValue = target - nums[i];
      if (hashMap.containsKey(pairValue)){
        return new int[]{hashMap.get(pairValue), i};
      } else {
        hashMap.put(pairValue, i);
      }
    }

  }
}
