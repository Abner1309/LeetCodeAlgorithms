public class Solution {
    public static int searchInsert(int[] nums, int target) {
        if (nums.length == 1) {
            if (target == nums[0] || target < nums[0]) { return 0; }
            if (target > nums[0]) { return 1; }
        }

        int leftPart = 0;
        int middle = 0;
        int rightPart = nums.length - 1;

        while (leftPart < rightPart) {
            middle = (leftPart + rightPart) / 2;

            if (nums[leftPart] == target) { return leftPart; }
            if (nums[middle] == target) { return middle; }
            if (nums[rightPart] == target) { return rightPart; }

            if (target < nums[middle]) {
                rightPart = middle - 1;
                continue;
            }
            if (nums[middle] < target) {
                leftPart = middle + 1;
                continue;
            }
        }

        if (target > nums[leftPart]) { return leftPart + 1; }
        if (target < nums[leftPart]) { return leftPart; }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 5;
        System.out.println("Answer: " + searchInsert(nums, target));
    }
}
