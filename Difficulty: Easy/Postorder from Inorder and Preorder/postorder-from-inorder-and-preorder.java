class GfG {
    
    void printPostOrder(int in[], int pre[]) {
        solve(in, pre, 0, in.length - 1, 0, pre.length - 1);
    }
    
    void solve(int in[], int pre[], int inStart, int inEnd, int preStart, int preEnd) {
        if (inStart > inEnd || preStart > preEnd) return;
        
        int root = pre[preStart]; 
        int rootIndex = -1;
        for (int i = inStart; i <= inEnd; i++) {
            if (in[i] == root) {
                rootIndex = i;
                break;
            }
        }
        
        int leftSize = rootIndex - inStart;
        
        solve(in, pre, inStart, rootIndex - 1, preStart + 1, preStart + leftSize);
        
        solve(in, pre, rootIndex + 1, inEnd, preStart + leftSize + 1, preEnd);
        
        
        System.out.print(root + " ");
    }
}