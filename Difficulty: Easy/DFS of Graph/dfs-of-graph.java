class Solution {
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        ArrayList<Integer > arr = new ArrayList<>();
       boolean visited[] =new boolean[adj.size()];
        for(int  i =0; i<adj.size();i++){
          //  int node = adj.get(i);
            if(!visited[i]){
                dfs(arr,adj,i,visited);
            }
        }
        return arr;
    }
    public void dfs(ArrayList<Integer>arr,ArrayList<ArrayList<Integer>> adj,int i,boolean visited[] ){
        arr.add(i);
        visited[i]=true;
        for(int neighbour:adj.get(i)){
            if(!visited[neighbour]){
                dfs(arr,adj,neighbour,visited);
            }
        }
    }
}