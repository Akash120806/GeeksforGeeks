/* class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
} */

class Solution {
    int findCeil(Node root, int x) {
        // code here
        int  y=-1;
     
        while(root!= null ){
            if(root.data==x){
                return root.data;
            }
            else if(x>root.data){
                root=root.right;
            }
            else{
                y=root.data;
                root=root.left;
            }
        }
            return y;
    }
}