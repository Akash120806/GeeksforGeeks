// User function Template for Java

/* A Binary Tree node

class Node {
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
} */
class Solution {
    // Return a list containing the inorder traversal of the given tree
    ArrayList<Integer> inOrder(Node root) {
        Stack<Node> st=new Stack<>();
        ArrayList<Integer> arr=new ArrayList<>();
        Node node=root;
        while(node!=null || !st.isEmpty()){
            while(node!=null){
                st.push(node);
                node=node.left;
            }
             node=st.pop();
             arr.add(node.data);
             node=node.right;
        }
        return arr;
     
        
        
    }
}