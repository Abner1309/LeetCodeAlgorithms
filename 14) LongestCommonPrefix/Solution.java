public class Solution {
    private int getShortestWord(String[] strs) {
        int shortestValue = 300;
        int actualLength;

        for (String str : strs) {
            actualLength = str.length();
            if (actualLength < shortestValue) {
                shortestValue = actualLength;
            }
        }

        return shortestValue;
    }

    public String longestCommonPrefix(String[] strs) {
        StringBuilder finalString = new StringBuilder();
        int arrayLength = strs.length;
        int shortestLength = getShortestWord(strs);

        char character1, character2;
        for (int i = 0; i < shortestLength; i++) {
            character1 = strs[0].charAt(i);
            for (int j = 1; j < arrayLength; j++) {
                character2 = strs[j].charAt(i);
                if (character1 != character2) {
                    return finalString.toString();
                }
            }
            finalString.append(character1);
        }

        return finalString.toString();
    }
}
