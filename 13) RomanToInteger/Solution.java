class Solution {
    public static int romanToInt(String s) {
        int result = 0;
        StringBuilder finalString = new StringBuilder(s);

        char c1, c2;
        for (int i = 0; i < finalString.length(); i++) {
            c1 = finalString.charAt(i);

            if (i < finalString.length() - 1) c2 = finalString.charAt(i+1);
            else c2 = 'I';

            switch (c1) {
                case 'I':
                    if (c2 == 'V') {
                        result += 4;
                        i++;
                    }
                    else if (c2 == 'X') {
                        result += 9;
                        i++;
                    }
                    else {
                        result += 1;
                    }
                    break;
                case 'V':
                    result += 5;
                    break;
                case 'X':
                    if (c2 == 'L') {
                        result += 40;
                        i++;
                    }
                    else if (c2 == 'C') {
                        result += 90;
                        i++;
                    }
                    else {
                        result += 10;
                    }
                    break;
                case 'L':
                    result += 50;
                    break;
                case 'C':
                    if (c2 == 'D') {
                        result += 400;
                        i++;
                    }
                    else if (c2 == 'M') {
                        result += 900;
                        i++;
                    }
                    else {
                        result += 100;
                    }
                    break;
                case 'D':
                    result += 500;
                    break;
                case 'M':
                    result += 1000;
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
        }
        return result;
    }

    public static void main (String[] args) {
        String a = "MCMXCIV";
        System.out.println("Result: " + romanToInt(a));
    }
}
