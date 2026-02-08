import java.util.*;

public class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> answer = new HashSet<>();
        Arrays.sort(nums);

        int i = 0, j = 1, k = 2, l = nums.length - 1, calculus;
        if (nums.length < 4) {
            return new ArrayList<>();
        }

        long sum = nums[i] + nums[j] + nums[k] + nums[l];
        if (sum > 2147483646 || nums.length < 4) {
            return new ArrayList<>();
        }

        while (i < nums.length - 3) {
            while (j < nums.length - 2) {
                while (k < l) {
                    ArrayList<Integer> fragment = new ArrayList<>();
                    calculus = (nums[i] + nums[j] + nums[k] + nums[l]);
                    if (calculus == target) {
                        fragment.add(nums[i]); fragment.add(nums[j]); fragment.add(nums[k]); fragment.add(nums[l]);
                        answer.add(fragment);
                        k++;
                    }
                    else if (calculus < target){
                        k++;
                    }
                    else {
                        l--;
                    }
                }
                j++; k = j + 1; l = nums.length - 1;
            }
            i++; j = i + 1; k = j + 1; l = nums.length - 1;
        }

        return new ArrayList<>(answer);
    }
}