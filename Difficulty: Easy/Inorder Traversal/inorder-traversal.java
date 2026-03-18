class Solution {
    
    ArrayList<Integer> list = new ArrayList<>();
    
    public ArrayList<Integer> inOrder(Node root) {
        
        inorder(root);
        return list;
    }
    
    void inorder(Node root){
        
        if(root == null)
            return;
            
        inorder(root.left);      // Left
        list.add(root.data);     // Root
        inorder(root.right);     // Right
    }
}