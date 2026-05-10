class Solution {

    int floorSqrt(int n) {

        int low = 1;
        int high = n;

        int ans = 0;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            long square = (long) mid * mid;

            // perfect square
            if (square == n) {
                return mid;
            }

            // move right
            else if (square < n) {
                ans = mid;
                low = mid + 1;
            }

            // move left
            else {
                high = mid - 1;
            }
        }

        return ans;
    }
}