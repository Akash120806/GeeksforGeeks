// User function Template for Java

/*
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/
import java.util.*;
class Tree {
    ArrayList<Integer> postOrder(Node node) {
        // code here
        ArrayList<Integer> result= new ArrayList<>();
        Node curr= node;
        Stack<Node> s = new Stack<>();
   
        while(curr!=null || !s.isEmpty()){
            while(curr!=null){
                 s.push(curr);
                curr = curr.left;
               
            }
            if(s.peek().right != null ){
                curr= s.peek().right;
                
            }
            else{
                Node temp= s.peek();
                result.add(s.pop().data);
                while(!s.isEmpty() && temp==s.peek().right){
                    temp=s.pop();
                    result.add(temp.data);
                }
            }
        
        }
        return result;
    }
}