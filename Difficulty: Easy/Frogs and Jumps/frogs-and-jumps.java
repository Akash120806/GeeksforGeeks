class Solution {
    public int unvisitedLeaves(int[] arr, int k) {
        boolean[] visited = new boolean[k + 1];

        // Mark all leaves visited by each frog
        for (int s : arr) {
            for (int j = s; j <= k; j += s) {
                visited[j] = true;
            }
        }

        // Count unvisited leaves
        int count = 0;

        for (int i = 1; i <= k; i++) {
            if (!visited[i]) {
                count++;
            }
        }

        return count;
    }
}