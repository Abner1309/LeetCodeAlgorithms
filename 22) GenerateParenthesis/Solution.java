import java.util.ArrayList;
import java.util.List;

public class Solution {
    private void backtrackParenthesis(List<String> answer, StringBuilder fragment, int n, int pOpen, int pClosed) {
        if (fragment.length() == 2 * n) {
            answer.add(fragment.toString());
            return;
        }

        if (pOpen < n) {
            fragment.append('(');
            backtrackParenthesis(answer, fragment, n, pOpen + 1, pClosed);
            fragment.deleteCharAt(fragment.length() - 1);
        }

        if (pClosed < pOpen) {
            fragment.append(')');
            backtrackParenthesis(answer, fragment, n, pOpen, pClosed + 1);
            fragment.deleteCharAt(fragment.length() - 1);
        }
    }

    public List<String> generateParenthesis(int n) {
        List<String> answer = new ArrayList<>();
        StringBuilder fragment = new StringBuilder();

        backtrackParenthesis(answer, fragment, n, 0, 0);

        return answer;
    }
}
