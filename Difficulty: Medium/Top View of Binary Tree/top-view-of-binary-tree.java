/*
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}
*/
class Solution {
    public ArrayList<Integer> topView(Node root) {
        
        ArrayList<Integer> ans = new ArrayList<>();
        if (root == null) return ans;

        TreeMap<Integer, Integer> map = new TreeMap<>();

        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(root, 0)); 
        while (!q.isEmpty()) {
            Pair p = q.poll();
            Node node = p.node;
            int col = p.col;

            if (!map.containsKey(col)) {
                map.put(col, node.data);
            }

            if (node.left != null) {
                q.offer(new Pair(node.left, col - 1));
            }

            if (node.right != null) {
                q.offer(new Pair(node.right, col + 1));
            }
        }

        for (int val : map.values()) {
            ans.add(val);
        }

        return ans;
    }
}

class Pair {
    Node node;
    int col;

    Pair(Node node, int col) {
        this.node = node;
        this.col = col;
    }
}