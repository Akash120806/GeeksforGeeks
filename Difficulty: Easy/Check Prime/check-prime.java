//{ Driver Code Starts
//Initial Template for Java

import java.util.Scanner;

class Main {

    
// } Driver Code Ends

//User function Template for Java

public static boolean prime(int n){
    boolean num=true;
    if(n<=0 || n==1){
        return false;
        
    }
    for(int i=2;i<=100;i++){
        if(i==n){
            i+=1;
        }
        if(n%i==0){
            num=false;
            break;
        }
    }
        
      return num;  
    //Write your code here
    //returns a boolean value 
    
}


//{ Driver Code Starts.

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-- > 0) {
            int n = scn.nextInt();
            boolean ans = prime(n);
            if(ans)
            System.out.println("True");
            else
            System.out.println("False");
        
System.out.println("~");
}
        scn.close();
    }
}
// } Driver Code Ends