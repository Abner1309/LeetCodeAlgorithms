import java.util.*;

public class Solution {
    public static List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> answer = new HashSet<>();
        Arrays.sort(nums);

        int i = 0;
        int j = 1;
        int k = nums.length - 1;

        int sum;
        while (i < nums.length - 2) {
            while (j < k) {
                sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) {
                    List<Integer> numbers = new ArrayList<>();
                    numbers.add(nums[i]);
                    numbers.add(nums[j]);
                    numbers.add(nums[k]);
                    answer.add(numbers);
                    j++;
                }
                else if (sum > 0) k--;
                else j++;
            }
            i++;
            j = i + 1;
            k = nums.length - 1;
        }

        return new ArrayList<>(answer);
    }
}