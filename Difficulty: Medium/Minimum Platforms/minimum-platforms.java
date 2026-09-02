class Solution {
    public int minPlatform(int arr[], int dep[]) {
        //  code here
        Arrays.sort(arr);
        Arrays.sort(dep);
        int i =0, j=0;
        int max=0;
        int co=0;
        while(i<arr.length){
            if(arr[i]<=dep[j]){
                i++;
                co++;
            }
            else{
                j++;
                co--;
            }
            max=Math.max(max,co);
        }
        return max;
    }
}
