class Solution {
    int countFreq(int[] arr, int target) {
        // code here
        int f = first(arr,target);
        if(f==-1) return 0;
        int l = last( arr,  target);
        return (l-f)+1;
        
        
    }
    public int first(int[] arr, int target){
        int low=0;
        int high=arr.length-1;
        int ans=-1;
        while(low<=high){
            int mid=(high+low)/2;
            if(arr[mid]==target){
                ans=mid;
                high=mid-1;
            }
            else if(arr[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    public int last(int[] arr, int target){
        int low=0;
        int high=arr.length-1;
        int ans=-1;
        while(low<=high){
            int mid=(high+low)/2;
            if(arr[mid]==target){
                ans=mid;
                low=mid+1;
            }
            else if(arr[mid]>target){
                high=mid-1;
            }
            else{
               low=mid+1 ;
            }
        }
        return ans;
    }
}
