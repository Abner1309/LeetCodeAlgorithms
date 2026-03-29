import java.util.Stack;

public class Solution {
    public static int search(int[] nums, int target) {
        if (nums.length == 1 && target == nums[0]) { return 0; }
        if (nums.length == 1 && target != nums[0]) { return -1; }

        int leftExtremity = 0;
        int middle = 0;
        int rightExtremity = nums.length - 1;

        while (leftExtremity < rightExtremity) {
            middle = (leftExtremity + rightExtremity) / 2;

            if (target == nums[leftExtremity]) {
                return leftExtremity;
            }
            if (target == nums[middle]) {
                return middle;
            }
            if (target == nums[rightExtremity]) {
                return rightExtremity;
            }


            if (nums[leftExtremity] < nums[middle]) {
                if (target > nums[leftExtremity] && target < nums[middle]) {
                    rightExtremity = middle - 1;
                    continue;
                }
                leftExtremity = middle + 1;
                continue;
            }

            if (nums[rightExtremity] > nums[middle]) {
                if (target < nums[rightExtremity] && target > nums[middle]) {
                    leftExtremity = middle + 1;
                    continue;
                }
                rightExtremity = middle - 1;
                continue;
            }


            leftExtremity++;
        }

        return -1;
    }    

    public static void main(String[] args) {
        int[] nums = {3, 1};
        int target = 0;
        System.out.println("Result: " + search(nums, target));
    }
}
