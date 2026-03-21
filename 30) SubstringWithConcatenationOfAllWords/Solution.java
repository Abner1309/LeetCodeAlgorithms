import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    private static boolean checkSubString(int len, String target, String[] words) {
        StringBuilder auxiliary = new StringBuilder();
        ArrayList<String> listWords = new ArrayList<>(List.of(words));

        for (int i = 0; i < target.length(); i = i + len) {
            auxiliary.append(target, i, i + len);
            if (listWords.contains(auxiliary.toString())) {
                listWords.remove(auxiliary.toString());
                auxiliary.setLength(0);
            }
            else { return false; }
        }

        return true;
    }

    public static List<Integer> findSubstring(String s, String[] words) {
        List<Integer> answer = new ArrayList<>();
        StringBuilder auxiliary = new StringBuilder();
        int numberOfStrings = words.length;
        int lengthOfEachString = words[0].length();
        int chunkLength = numberOfStrings * lengthOfEachString;

        for (int i = 0; i < s.length(); i = i + lengthOfEachString) {
            try { auxiliary.append(s, i, i + chunkLength); }
            catch (IndexOutOfBoundsException e) { break; }
        }

        return answer;
    }

    public static void main(String[] args) {
        String str = "barfoothefoobarman";
        String[] strings = {"foo", "bar"};
        // Correct Answer = [0, 9]
        System.out.println(findSubstring(str, strings));
    }
}
