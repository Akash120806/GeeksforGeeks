class Solution {
    static int solve(int bt[]) {
        // code here
        Arrays.sort(bt);
        int t=0;
        int w=0;
        for(int i=0; i<bt.length;i++){
            w+=t;
            t+=bt[i];
        }
        return w/bt.length;
    }
}
