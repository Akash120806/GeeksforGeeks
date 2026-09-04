import java.util.*;
class Solution {
    public int pageFaults(int[] pages, int c) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        int fault=0;
        for(int page : pages){
             if(set.contains(page)){
                 set.remove(page);
                 set.add(page);
             }
             else{
                 fault++;
                 if(set.size()==c){
                     int lru = set.iterator().next();
                     set.remove(lru);
                 }
                 set.add(page);
             }
        }
        return fault;
        
    }
}