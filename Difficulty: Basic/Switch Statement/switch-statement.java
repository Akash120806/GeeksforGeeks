//{ Driver Code Starts
// Initial Template for Java

import java.util.Scanner;

class Main {

    
// } Driver Code Ends

// User function Template for Java

public static String utility(int number) {
    switch(number){
           case 1:
            return "One";

            case 2:
            return "Two";
            
            case 3:
            return "Three";
            
            case 4:
         return "Four";
           
             case 5:
           return "Five";
           
             case 6:
           return "Six";
            
             case 7:
            return "Seven";
            
             case 8:
            return "Eight";
           
             case 9:
           return "Nine";
           
            default:
                return "Unknown";
            
        
    }

    // write your code here
}


//{ Driver Code Starts.

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- > 0) {
            int number = scn.nextInt();
            System.out.println(utility(number));
        }
        scn.close();
    }
}
// } Driver Code Ends