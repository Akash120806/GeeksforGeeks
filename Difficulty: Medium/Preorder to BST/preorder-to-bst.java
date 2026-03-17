// User function Template for Java

/*
class Node {
    int data;
    Node left, right;

    Node(int d) {
        data = d;
        left = right = null;
    }
}
*/

class Solution {
    int i=0;
    // Function that constructs BST from its preorder traversal.
    public Node Bst(int pre[], int size) {
        return pre(pre, Integer.MIN_VALUE ,Integer.MAX_VALUE);
    }
        // code here
    public Node pre(int preorder[], int min , int max){
        if(i>=preorder.length) return null;
        int data=preorder[i];
        if(data<min|| data>max) return null;
        Node root= new Node(data);
        i++;
        root.left=pre(preorder, min ,data);
        root.right=pre(preorder, data , max);
        return root;
        
        
    }
    
}