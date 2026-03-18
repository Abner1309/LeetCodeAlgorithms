public class Solution {
    private int divideExtreme(int dividend, int divisor) {
        // pass
    }

    private int dividePositive(int dividend, int divisor) {
        int count = 0;

        if (Math.abs(divisor) == 1) { return Math.abs(dividend); }

        int aux1 = Math.abs(dividend), aux2 = Math.abs(divisor);
        while (aux1 >= aux2) {
            aux1 = aux1 - aux2;
            count++;
        }

        return count;
    }

    private int divideNegative(int dividend, int divisor) {
        int count = 0;

        if (Math.abs(divisor) == 1) { return -Math.abs(dividend); }

        int aux1 = Math.abs(dividend), aux2 = Math.abs(divisor);
        while (aux1 >= aux2) {
            aux1 = aux1 - aux2;
            count--;
        }

        return count;
    }

    public int divide(int dividend, int divisor) {
        int answer = 0;

        if (dividend >= 0 && divisor >= 0) { answer = dividePositive(dividend, divisor); }
        else if (dividend >= 0 && divisor < 0) { answer = divideNegative(dividend, divisor); }
        else if (dividend < 0 && divisor >= 0) { answer = divideNegative(dividend, divisor); }
        else { answer = dividePositive(dividend, divisor); }

        return answer;
    }
}
