import java.util.Arrays;

public class Solution {
    private int findIndex(int[] nums, int start, int value) {
        int i = start;

        while (i < nums.length) {
            if (nums[i] == value) { return i; }
        }

        return -1;
    }

    private void swapElements (int[] nums, int index1, int index2) {
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }

    private void partialSort (int[] nums, int start) {
        // PASS
    }

    public void nextPermutation(int[] nums) {
        int firstPointer = nums.length - 2;
        int secondPointer = nums.length - 1;

        int auxiliary = -1;
        while (firstPointer >= 0) {
            if (nums[firstPointer] < nums[secondPointer]) {
                auxiliary = findIndex(nums, firstPointer, nums[firstPointer] + 1);
                swapElements(nums, firstPointer, auxiliary);
                partialSort(nums, firstPointer + 1);
                return;
            }
            firstPointer--;
            secondPointer--;
        }

        Arrays.sort(nums);
    }
}
