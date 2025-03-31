//{ Driver Code Starts
// Initial Template for Java

import java.util.Scanner;

class Main {

    
// } Driver Code Ends

// User function Template for Java

public static int apTerm(int a, int d, int n) {
    // Complete the code above
    int ans = a + (n - 1) * d;
        // Complete the code above

        // The line below returns the output. Don't change it!
        return ans;
}


//{ Driver Code Starts.

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- > 0) {
            int a = scn.nextInt();
            int d = scn.nextInt();
            int n = scn.nextInt();
            System.out.println(apTerm(a, d, n));
        }
        scn.close();
    }
}
// } Driver Code Ends