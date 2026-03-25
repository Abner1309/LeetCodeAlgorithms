import java.util.Arrays;

public class Solution {
    private static int findIndexElement(int[] nums, int start, int value) {
        int i = start, j = -1;
        int target = Integer.MAX_VALUE;

        while (i < nums.length) {
            if (nums[i] > value && nums[i] < target) {
                target = nums[i];
                j = i;
            }
            i++;
        }

        return j;
    }

    private static void swapElements (int[] nums, int index1, int index2) {
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }

    private static void partialSort (int[] nums, int start) {
        int i = start, j = i + 1;

        while (j < nums.length) {
            if (nums[i] > nums[j]) {
                swapElements(nums, i, j);
                i = start; j = i + 1;
            }
            else {
                i++; j++;
            }
        }
    }

    public static void nextPermutation(int[] nums) {
        int firstPointer = nums.length - 2;
        int secondPointer = nums.length - 1;

        while (firstPointer >= 0) {
            if (nums[firstPointer] < nums[secondPointer]) {
                swapElements(nums, firstPointer, findIndexElement(nums, firstPointer + 1, nums[firstPointer]));
                partialSort(nums, firstPointer + 1);
                return;
            }
            firstPointer--;
            secondPointer--;
        }

        Arrays.sort(nums);
    }

    public static void main(String[] args) {
        int[] vet = {2, 3, 1};
        System.out.println(Arrays.toString(vet));
        nextPermutation(vet);
        System.out.println(Arrays.toString(vet));
    }
}
