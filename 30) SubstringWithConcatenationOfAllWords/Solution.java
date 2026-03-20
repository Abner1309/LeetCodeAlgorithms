import java.util.List;

public class Solution {
    private static boolean checkSubstring(String subStr, String[] words) {

    }

    public static List<Integer> findSubstring(String s, String[] words) {
        StringBuilder answer = new StringBuilder();
        int numberOfStrings = words.length;
        int lengthOfEachString = words[0].length();
        int chunkLength = numberOfStrings * lengthOfEachString;

        for (int i = 0; i < s.length(); i++) {
            answer.append(s.charAt(i));
            if (answer.length() % chunkLength == 0) {
                // FUNCTION CALL
            }
        }
    }

    public static void main(String[] args) {
        String str = "barfoothefoobarman";
        String[] strings = {"foo", "bar"};
        // Correct Answer = [0, 9]
        System.out.println(findSubstring(str, strings));
    }
}
