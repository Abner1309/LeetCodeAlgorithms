import java.util.Arrays;

public class Solution {
    private static int[] helper(int[] nums, int pointer, int target) {
        int start = -1, end = -1;

        int i = pointer;
        while (i > 0 && nums[i-1] == target) { i--; }
        start = i;
        while (i < nums.length - 1 && nums[i+1] == target) { i++; }
        end = i;
        return new int[] {start, end};
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] answer = {-1, -1};
        
        if (nums.length == 0) { return answer; }
        if (nums.length == 1 && nums[0] == target) { answer[0] = 0; answer[1] = 0; return answer; }

        int leftPart = 0;
        int middle = 0;
        int rightPart = nums.length - 1;

        while (leftPart < rightPart) {
            middle = (leftPart + rightPart) / 2;

            if (nums[leftPart] == target) { return helper(nums, leftPart, target); }
            if (nums[middle] == target) { return helper(nums, middle, target); }
            if (nums[rightPart] == target) { return helper(nums, rightPart, target); }

            if (nums[middle] < target) {
                leftPart = middle + 1;
                continue;
            }
            if (nums[middle] > target) {
                rightPart = middle - 1;
                continue;
            }
        }        

        return answer;
    }    

    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        System.out.println("Search Range: " + Arrays.toString(searchRange(nums, target)));
    }
}
