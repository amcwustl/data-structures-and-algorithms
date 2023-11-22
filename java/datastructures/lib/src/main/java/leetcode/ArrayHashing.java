package leetcode;

import java.util.*;

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

  public List<List<String>> groupAnagrams(String[] strs) {

    HashMap<String, List<String>> hashMap = new HashMap<>();
    List<List<String>> returnList = new ArrayList<>();

    for(int i = 0; i < strs.length; i++){
      char[] charArray = strs[i].toCharArray();
      Arrays.sort(charArray);
      String sortedString = new String(charArray);

      if(!hashMap.containsKey(sortedString)) {
        List<String> originalWord = new ArrayList<>();
        originalWord.add(strs[i]);
        hashMap.put(sortedString, originalWord);
      } else {
        hashMap.get(sortedString).add(strs[i]);
      }
    }

    for(String key : hashMap.keySet()) {
      returnList.add(hashMap.get(key));
    }
    return returnList;

  }

  public int[] topKFrequent(int[] nums, int k) {
    HashMap<Integer, Integer>

  }

  public int longestConsecutive(int[] nums) {
    if (nums.length == 0){
      return 0;
    }
    int longestSequence = 0;
    HashSet<Integer> numbers = new HashSet<>();

    for (int num : nums){
      numbers.add(num);
    }

    for (int num : nums){
      if(!numbers.contains(num - 1)){
        int currentSequence = 1;
        int currentElement = num;
        while (numbers.contains(currentElement + 1)){
          currentSequence += 1;
          currentElement += 1;
        }
        longestSequence = Math.max(longestSequence, currentSequence);
      }
    }
    return longestSequence;
  }
}
