//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            int a;
            a = Integer.parseInt(br.readLine());

            int b;
            b = Integer.parseInt(br.readLine());

            Solution obj = new Solution();
            int[] ans = obj.lcmAndGcd(a, b);
            System.out.println(ans[0] + " " + ans[1]);
            System.out.println("~");
        }
    }
}


// } Driver Code Ends


// User function Template for Java

class Solution {
    public static int[] lcmAndGcd(int a, int b) {
        // code here
      //  int[] arr=new int[2];
        // if(a>b|| a==b){
        //     if(a%b==0){
        //         arr.add(a);
        //     }
        //     else{
        //         arr.add(a*b);
        //     }
        // }
        // else{
        //      if(b%a==0){
        //         arr.add(a);
        //     }
        //     else{
        //         arr.add(a*b);
        //     }
        // }
        // int j=0;
        // for(int i=1;i<=a||i<=b;i++){
        //     if(a%i==0&&a%b==0){
        //         j+=i;
        //         if(j<i){
        //             j=i;
        //         }
        //         arr.add(j);
        //     }
        // }
        // return arr;
        int x=a;
        int y=b;
       while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }

        int gcd = x;
        int lcm = (a* b) / gcd;

        return new int[]{lcm, gcd};
    }
}


//{ Driver Code Starts.

// } Driver Code Ends