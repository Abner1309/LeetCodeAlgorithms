import java.util.Stack;

public class Solution {
    public static int longestValidParentheses(String s) {        
        if (s.length() < 2) {
            return 0;
        }

        int answer = 0;
        int auxiliary = 0;
        Stack<Integer> indexStack = new Stack<>();
        indexStack.push(-1);

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                indexStack.push(i);
            }   
            else {
                indexStack.pop();
                if (indexStack.empty()) {
                    indexStack.push(i);
                }
                else {
                    auxiliary = i - indexStack.peek();
                    if (auxiliary > answer) {
                        answer = auxiliary;
                    }
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        String strTest1 = "()(()";
        System.out.println("Longest Valid Parentheses: " + longestValidParentheses(strTest1));
    }
}
