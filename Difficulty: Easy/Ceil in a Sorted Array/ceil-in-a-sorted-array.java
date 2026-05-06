// User function Template for Java
class Solution {
    public int findCeil(int[] arr, int x) {
        // code here
        int low =0;
        int high=arr.length-1;
        int and=-1;
        while(low<=high){
            int mid =(low+high)/2;
            if(arr[mid]>=x){
                and=mid;
                high=mid-1;
            }
            else if(arr[mid]<x){
                low=mid+1;
            }
        }
        return and;
        
    }
}
