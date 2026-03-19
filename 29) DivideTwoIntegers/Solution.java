public class Solution {
    private int dividePositivePositive(int dividend, int divisor) {
        int count = 0;

        if (divisor == 1) { return dividend; }

        int aux1 = dividend, aux2 = divisor;
        while (aux1 >= aux2) {
            aux1 = aux1 - aux2;
            count++;
        }

        return count;
    }

    private int dividePositiveNegative(int dividend, int divisor) {
        int count = 0;

        if (divisor == -1) { return Math.negateExact(dividend); }

        int aux1 = Math.negateExact(dividend), aux2 = divisor;
        while (aux1 <= aux2) {
            aux1 = aux1 - aux2;
            count--;
        }

        return count;
    }

    private int divideNegativePositive(int dividend, int divisor) {
        int count = 0;

        if (divisor == 1) { return dividend; }

        int aux1 = dividend, aux2 = Math.negateExact(divisor);
        while (aux1 <= aux2) {
            aux1 = aux1 - aux2;
            count--;
        }

        return count;
    }

    private int divideNegativeNegative(int dividend, int divisor) {
        int count = 0;

        if (dividend == Integer.MIN_VALUE && divisor == -1) { return Integer.MAX_VALUE; }
        if (divisor == -1) { return Math.negateExact(dividend); }

        int aux1 = dividend, aux2 = divisor;
        while (aux1 <= aux2) {
            aux1 = aux1 - aux2;
            count++;
        }

        return count;
    }

    public int divide(int dividend, int divisor) {
        int answer = 0;

        if (dividend >= 0 && divisor >= 0) { answer = dividePositivePositive(dividend, divisor); }
        else if (dividend >= 0 && divisor < 0) { answer = dividePositiveNegative(dividend, divisor); }
        else if (dividend < 0 && divisor >= 0) { answer = divideNegativePositive(dividend, divisor); }
        else { answer = divideNegativeNegative(dividend, divisor); }

        return answer;
    }
}
