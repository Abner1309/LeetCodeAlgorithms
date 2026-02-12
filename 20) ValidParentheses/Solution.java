public class Solution {
    private boolean isBracketLeft(char c) {
        return c == '(' || c == '[' || c == '{';
    }

    private boolean isBracketRight(char c) {
        return c == ')' || c == ']' || c == '}';
    }

    private boolean bracketVerification(char c1, char c2) {
        if (c1 == '(' && c2 == ')') return true;
        if (c1 == '[' && c2 == ']') return true;
        if (c1 == '{' && c2 == '}') return true;
        return false;
    }

    public boolean isValid(String s) {
        StringBuilder auxStr = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (isBracketLeft(s.charAt(i))) {
                auxStr.append(s.charAt(i));
            }
            else if (isBracketRight(s.charAt(i))) {
                if (auxStr.isEmpty()) return false;

                if(bracketVerification(auxStr.charAt(auxStr.length() - 1), s.charAt(i))) {
                    auxStr.deleteCharAt(auxStr.length() - 1);
                }
                else {
                    return false;
                }
            }
        }

        return auxStr.isEmpty();
    }
}
