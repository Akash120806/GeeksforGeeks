class Solution {
    public int beautySum(String S) {

        int n = S.length();
        int ans = 0;

        // Starting index
        for (int i = 0; i < n; i++) {

            int[] freq = new int[26];

            // Ending index
            for (int j = i; j < n; j++) {

                char ch = S.charAt(j);
                freq[ch - 'a']++;

                int maxFreq = 0;
                int minFreq = Integer.MAX_VALUE;

                // Find max and min frequency
                for (int k = 0; k < 26; k++) {

                    if (freq[k] > 0) {
                        maxFreq = Math.max(maxFreq, freq[k]);
                        minFreq = Math.min(minFreq, freq[k]);
                    }
                }

                ans += (maxFreq - minFreq);
            }
        }

        return ans;
    }
}