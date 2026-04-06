class Solution {
    ArrayList<Integer> boundaryTraversal(Node root) {
        ArrayList<Integer> res = new ArrayList<>();
        
        if (root == null) return res;

        if (!(root.left == null && root.right == null)) {
            res.add(root.data);
        }

        leftNode(res, root);
        leafNode(res, root);
        rightNode(res, root);

        return res;
    }

    public void leftNode(ArrayList<Integer> res, Node root) {
        Node ln = root.left;
        while (ln != null) {
            if (!(ln.left == null && ln.right == null)) {
                res.add(ln.data);
            }

            if (ln.left != null) ln = ln.left;
            else ln = ln.right;
        }
    }

    public void rightNode(ArrayList<Integer> res, Node root) {
        Stack<Integer> s = new Stack<>();
        Node ln = root.right;

        while (ln != null) {
            if (!(ln.left == null && ln.right == null)) {
                s.push(ln.data);
            }

            if (ln.right != null) ln = ln.right;
            else ln = ln.left;
        }

        while (!s.isEmpty()) {
            res.add(s.pop());
        }
    }

    public void leafNode(ArrayList<Integer> res, Node root) {
        if (root == null) return;

        if (root.left == null && root.right == null) {
            res.add(root.data);
            return;
        }

        leafNode(res, root.left);
        leafNode(res, root.right);
    }
}