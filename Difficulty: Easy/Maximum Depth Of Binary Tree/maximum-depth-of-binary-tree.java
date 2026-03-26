// User function Template for Java

/*
// A Binary Tree node
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    public static int maxDepth(Node root) {
        // code here
        return Max(root);
        
        }
    public static int Max(Node root){
            if(root==null){
                return 0;
            }
            int lh= Max(root.left);
            int rh=Max(root.right);
            return Math.max(lh,rh)+1;
    
    }
}
