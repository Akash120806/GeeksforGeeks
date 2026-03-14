/*
class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public Node delNode(Node root, int x) {
        // code here
           if(root==null){
            return null;
        }
        else if(root.data>x){
            root.left=delNode(root.left, x);
        }
        else if(root.data<x){
            root.right=delNode(root.right, x);
        }
        else{
            if(root.left==null && root.right == null){
                return null;
            }
            else if(root.left==null){
                return root.right;
            }
            else if(root.right==null){
                return root.left;
            }
            else{
                Node successor = findsuccNode(root.right);
                root.data = successor.data;
                root.right=delNode(root.right, successor.data);

            }


        }
        
        return root;

    }
    public  Node findsuccNode(Node root){
            while(root.left!=null){
                root=root.left;
            }
            return root;
     
    }
}