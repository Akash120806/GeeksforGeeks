class Solution {
    public int numberOfSubarrays(int[] arr, int target) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        map.put(0, 1);
        
        int sum = 0;
        int count = 0;
        
        for (int num : arr) {
            
            sum += num;
            
            if (map.containsKey(sum - target)) {
                count += map.get(sum - target);
            }
            
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        
        return count;
    }
}