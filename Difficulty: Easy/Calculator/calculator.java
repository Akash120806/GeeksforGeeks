//{ Driver Code Starts
//Initial Template for Java

import java.util.Scanner;

class Main {

    
// } Driver Code Ends

//User function Template for Java

public static void utility(int a, int b, int operator){
      int i=0;
      String s="";
    //write your code here
    if(operator==1){
        i=a+b;
        s=String.valueOf(i);
        System.out.print(s);
        
    }
    else if(operator==2){
        i=-b+a;
        s=String.valueOf(i);
        System.out.print(s);
        
    }
     else if(operator==3){
        i=a*b;
        s=String.valueOf(i);
        System.out.print(s);
        
    } else {
        
        System.out.print("Invalid Input");
        
    }
    
    
}


//{ Driver Code Starts.

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-- > 0) {
            int a = scn.nextInt();
            int b = scn.nextInt();
            int operator = scn.nextInt();
            utility(a, b, operator);
            System.out.println();
        }
        scn.close();
    }
}
// } Driver Code Ends