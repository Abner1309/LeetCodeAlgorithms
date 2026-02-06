import java.util.ArrayList;
import java.util.List;

public class Solution {
    private String letters(String digits) {
        StringBuilder letter = new StringBuilder();
        char c;

        for (int i = 0; i < digits.length(); i++) {
            c = digits.charAt(i);
            if (c == '2') {
                letter.append("abc");
            }
            else if (c == '3') {
                letter.append("def");
            }
            else if (c == '4') {
                letter.append("ghi");
            }
            else if (c == '5') {
                letter.append("jkl");
            }
            else if (c == '6') {
                letter.append("mno");
            }
            else if (c == '7') {
                letter.append("pqrs");
            }
            else if (c == '8') {
                letter.append("tuv");
            }
            else {
                letter.append("wxyz");
            }
        }

        return letter.toString();
    }

    private int numberOfStrings(String digits) {
        int value = 1;
        char c;

        for (int i = 0; i < digits.length(); i++) {
            c = digits.charAt(i);
            if (c == '7' || c == '9') value = value * 4;
            else value = value * 3;
        }

        return value;
    }

    private void arrayMaker(int[] first, int[] step)

    public List<String> letterCombinations(String digits) {
        ArrayList<String> answer = new ArrayList<>();

        String word = letters(digits);
        int wordLength = word.length(); // 6
        int numberStr = numberOfStrings(digits); // 9

        int[] first = new int[wordLength];
        int[] step = new int[wordLength];

        return answer;
    }
}
