import java.util.ArrayList;

public class Solution {
    public int removeElement(int[] nums, int val) {
        ArrayList<Integer> answer = new ArrayList<Integer>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                answer.add(nums[i]);
            }
        }

        for (int i = 0; i < answer.size(); i++) {
            nums[i] = answer.get(i);
        }

        return answer.size();
    }
}
