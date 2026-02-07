import java.util.ArrayList;
import java.util.List;

public class Solution {
    private static final String[] MAPA = {
            "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
    };

    private void backTracking(int index, String digits, StringBuilder fragment, List<String> answer) {
        if (index == digits.length()) {
            answer.add(fragment.toString());
            return;
        }

        String letters = MAPA[digits.charAt(index) - '0'];

        for (char c : letters.toCharArray()) {
            fragment.append(c);
            backTracking(index + 1, digits, fragment, answer);
            fragment.deleteCharAt(fragment.length() - 1);
        }
    }

    public List<String> letterCombinations(String digits) {
        List<String> answer = new ArrayList<>();

        if (digits == null || digits.length() == 0) {
            return answer;
        }

        backTracking(0, digits, new StringBuilder(), answer);

        return answer;
    }
}
