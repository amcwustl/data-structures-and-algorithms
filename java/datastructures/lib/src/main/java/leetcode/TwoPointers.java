package leetcode;

import org.checkerframework.checker.units.qual.A;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoPointers {

  public List<List<Integer>> threeSum(int[] nums) {

    List<List<Integer>> output = new ArrayList<>();

    Arrays.sort(nums);

    for (int i = 0; i < nums.length - 2; i++){
      if(i !=0 && nums[i] == nums[i-1]){
        continue;
      }

      int j = i +1;
      int k = nums.length-1;

      while (j < k){
        int currentSum = nums[i]+nums[j]+nums[k];
        if (currentSum > 0){
          k--;
        } else if (currentSum < 0) {
          j++;
        } else {
          List<Integer> append = Arrays.asList(nums[i], nums[j], nums[k]);
          output.add(append);
          j++;
          while (nums[j] == nums [j-1] && j < k){
            j++;
          }
        }
      }

    }

    return output;




  }
}
