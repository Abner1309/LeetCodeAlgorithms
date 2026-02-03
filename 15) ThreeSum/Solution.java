import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        Arrays.sort(nums);

        int i = 0;
        int j = (nums.length - 1) / 2;
        int k = (nums.length - 1);

        int sum;
        while ((k - j != 1) || (j - i != 1)) {
            sum = nums[i] + nums[j] + nums[k];
            if (sum == 0) {
                List<Integer> numbers = new ArrayList<>();
                numbers.add(nums[i]);
                numbers.add(nums[j]);
                numbers.add(nums[k]);
                answer.add(numbers);
            }
            else if (sum > 0) {

            }
            else {

            }
        }

        return answer;
    }
}