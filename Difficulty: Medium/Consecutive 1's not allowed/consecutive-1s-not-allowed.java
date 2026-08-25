class Solution {
    int countStrings(int n) {
        // code here
        int zero =1;
        int one = 1;
        for(int i=2;i<=n ;i++){
            int newzero=zero+one ;
            int newone = zero;
            zero=newzero;
            one= newone;
        }
        return zero+one;
    }
}