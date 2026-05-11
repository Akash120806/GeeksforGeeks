class Solution {

    public int nthRoot(int n, int m) {

        // special case
        if (m == 0) {
            return 0;
        }

        int low = 1;
        int high = m;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            long ans = 1;

            // calculate mid^n
            for (int i = 0; i < n; i++) {

                ans *= mid;

                // stop early if exceeds m
                if (ans > m) {
                    break;
                }
            }

            if (ans == m) {
                return mid;
            }

            else if (ans < m) {
                low = mid + 1;
            }

            else {
                high = mid - 1;
            }
        }

        return -1;
    }
}