//{ Driver Code Starts
// Initial Template for Java

import java.util.Scanner;

class Main {
    static Scanner scn = new Scanner(System.in);

    
// } Driver Code Ends

// User function Template for Java
public static void utility() {
    String a = scn.nextLine();
    String b = scn.nextLine();
    String separator = scn.nextLine();
    System.out.print(a+separator+b);
    System.out.println();
    // Your code below
}


//{ Driver Code Starts.

    public static void main(String[] args) {
        int t = scn.nextInt();
        scn.nextLine();
        while (t-- > 0) {
            utility();

            System.out.println("~");
        }
        scn.close();
    }
}
// } Driver Code Ends