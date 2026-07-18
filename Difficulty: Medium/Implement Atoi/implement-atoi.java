class Solution {
    public int myAtoi(String s) {

        int i = 0;
        int n = s.length();

        // 1. Skip leading spaces
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        if (i == n) {
            return 0;
        }

        int sign = 1;

        if (s.charAt(i) == '-') {
            sign = -1;
            i++;
        }
        else if (s.charAt(i) == '+') {
            i++;
        }
        long ans = 0;

        while (i < n && s.charAt(i) >= '0' && s.charAt(i) <= '9') {

            int digit = s.charAt(i) - '0';

            ans = ans * 10 + digit;

            if (sign == 1 && ans > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }

            if (sign == -1 && -ans < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }

            i++;
        }

        return (int)(sign * ans);
    }
}