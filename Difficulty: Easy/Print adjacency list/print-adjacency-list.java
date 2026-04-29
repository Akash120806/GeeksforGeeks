
class Solution {
    public List<List<Integer>> printGraph(int V, int edges[][]) {
        // code here
        List<List<Integer>> l = new ArrayList<>();
        for(int i =0;i<V;i++){
            l.add(new ArrayList<Integer>());
        }
        for(int i =0;i<edges.length;i++){
            int u = edges[i][0];     
            int v = edges[i][1];   
            l.get(u).add(v);
            l.get(v).add(u);


         }
         return l;
    }
}