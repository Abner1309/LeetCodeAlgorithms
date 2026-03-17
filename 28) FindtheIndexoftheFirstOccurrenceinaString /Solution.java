public class Solution {
    public int strStr(String haystack, String needle) {
        int i, j;
        for (i = 0; i <= haystack.length(); i++) {
            for (j = 0; j < needle.length() && i + j < haystack.length(); j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) { break; }
            }
            if (j == needle.length()) { return i; }
        }

        return -1;
    }
}
