import java.util.Arrays;

public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int i = 0, j = 1, k = nums.length - 1;
        int sum, dif1, dif2, closest = 100000;

        while (i < nums.length - 2) {
            while (j < k) {
                sum = nums[i] + nums[j] + nums[k];
                dif1 = Math.abs(sum - target);
                dif2 = Math.abs(closest - target);
                if (dif1 < dif2) {
                    closest = sum;
                }

                if (sum < target) j++;
                else k--;
            }
            i++;
            j = i + 1;
            k = nums.length - 1;
        }

        return closest;
    }
}
