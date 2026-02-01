public class Solution {
    private int mille(int num, StringBuilder str) {
        int quantity = num / 1000;
        str.append("M".repeat(Math.max(0, quantity)));
        return (num - (quantity * 1000));
    }

    private int quingenti(int num, StringBuilder str) {
        if (num / 900 > 0) {
            str.append("CM");
            return (num - 900);
        }
        int quantity = num / 500;
        str.append("D".repeat(Math.max(0, quantity)));
        return (num - (quantity * 500));
    }

    private int centum(int num, StringBuilder str) {
        if (num / 400 > 0) {
            str.append("CD");
            return (num - 400);
        }
        int quantity = num / 100;
        str.append("C".repeat(Math.max(0, quantity)));
        return (num - (quantity * 100));
    }

    private int quinquaginta(int num, StringBuilder str) {
        if (num / 90 > 0) {
            str.append("XC");
            return (num - 90);
        }
        int quantity = num / 50;
        str.append("L".repeat(Math.max(0, quantity)));
        return (num - (quantity * 50));
    }

    private int decem(int num, StringBuilder str) {
        if (num / 40 > 0) {
            str.append("XL");
            return (num - 40);
        }
        int quantity = num / 10;
        str.append("X".repeat(Math.max(0, quantity)));
        return (num - (quantity * 10));
    }

    private int quinque(int num, StringBuilder str) {
        if (num / 9 > 0) {
            str.append("IX");
            return (num - 9);
        }
        int quantity = num / 5;
        str.append("V".repeat(Math.max(0, quantity)));
        return (num - (quantity * 5));
    }

    private void unus(int num, StringBuilder str) {
        if (num / 4 > 0) {
            str.append("IV");
            return;
        }
        str.append("I".repeat(Math.max(0, num)));
    }

    public String intToRoman(int num) {
        int rest = num;
        StringBuilder str = new StringBuilder();

        rest = mille(rest, str);
        rest = quingenti(rest, str);
        rest = centum(rest, str);
        rest = quinquaginta(rest, str);
        rest = decem(rest, str);
        rest = quinque(rest, str);
        unus(rest, str);

        return str.toString();
    }
}
