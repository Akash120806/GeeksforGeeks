class Solution {

    static long MOD = 1000000007;

    public static int countGoodNumbers(long N) {

        long evenPositions = (N + 1) / 2;
        long oddPositions = N / 2;

        long evenWays = power(5, evenPositions);
        long oddWays = power(4, oddPositions);

        long ans = (evenWays * oddWays) % MOD;

        return (int) ans;
    }

    static long power(long base, long exponent) {

        long ans = 1;

        while (exponent > 0) {

            if (exponent % 2 == 1) {
                ans = (ans * base) % MOD;
            }

            base = (base * base) % MOD;
            exponent = exponent / 2;
        }

        return ans;
    }
}