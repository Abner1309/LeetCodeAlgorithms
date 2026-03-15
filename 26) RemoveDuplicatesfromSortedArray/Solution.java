import java.util.ArrayList;

public class Solution {
    public int removeDuplicates(int[] nums) {
        int actual = nums[0];
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(actual);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != actual) {
                actual = nums[i];
                answer.add(nums[i]);
            }
        }

        for (int i = 0; i < answer.size(); i++) {
            nums[i] = answer.get(i);
        }

        return answer.size();
    }
}