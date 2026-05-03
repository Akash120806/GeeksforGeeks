class Solution {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        int v = adj.size();
        ArrayList<Integer> arr = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new  boolean [v];
        q.offer(0);
        visited[0]=true;
        while(!q.isEmpty()){
            int node = q.poll();
            arr.add(node);
            for(int n:adj.get(node)){
                if(!visited[n]){
                    q.offer(n);
                    visited[n]=true;
                }
            }
        }
        return arr;
    }
}