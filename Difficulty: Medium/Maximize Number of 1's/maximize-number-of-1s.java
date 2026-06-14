class Solution {
    public int maxOnes(int arr[], int k) {
        // code here
         int left =0;
        int z=0;
        int ml=0;
        for(int right =0;right<arr.length;right++){
            if(arr[right]==0){
                z++;
            }
            while(z>k){
                if(arr[left]==0){
                    z--;
                }
                left++;
            }
            ml=Math.max(ml,right-left+1);
        }
        return ml;
    }
}