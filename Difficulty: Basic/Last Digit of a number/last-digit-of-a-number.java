//{ Driver Code Starts
//Initial Template for Java

import java.util.Scanner;

class Main {
    
    
// } Driver Code Ends

//User function Template for Java

public static void utility(int n){
    String s= String.valueOf(n);
    char c=s.charAt(s.length()-1);
    //just complete below statement
    int ans = Integer.valueOf(String.valueOf(c));

    //below statement print the result
    System.out.println(ans);
}


//{ Driver Code Starts.

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-- > 0) {
            int n = scn.nextInt();
            utility(n);
        }
        scn.close();
    }
}
// } Driver Code Ends