// User function Template for Java

class Solution {
     
        // code here
        
    public int lower(int[]mat, int m , int x  ){
        int low=0;
        int high=m-1;
        int ans=-1;
        while (low<=high){
            int mid = low +(high-low)/2;
            if(mat[mid]==x){
                ans = mid;
                high=mid-1;
            }
            else if(mat[mid]<x){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return ans;

    }
   public int rowWithMax1s(int arr[][]) {
        int m= arr.length;
        int n= arr[0].length;
         int index=-1;
         int countmax=0;
         for(int i=0;i<m;i++){
            int countone;
            int firstone=lower(arr[i],n,1);
            if(firstone==-1){countone=0;}
            else{countone=n-firstone;} 
            if(countone>countmax){
                countmax=countone;
                index=i;
            }
         }
        return index;
    }
}
    
