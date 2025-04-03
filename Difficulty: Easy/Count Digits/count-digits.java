//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.evenlyDivides(N));

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    static int evenlyDivides(int n) {
     //  ArrayList<Integer> has= new ArrayList<> ();
       int ni=n;
       int sum=0;
       while(ni>0){
           int digit=ni%10;
            if(digit !=0 &&n%digit==0){
               sum+=1;
            }
            ni/=10;
       }
     
       return sum;
       // code here
    }
}