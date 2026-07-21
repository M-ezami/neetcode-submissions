class Solution {
    public int majorityElement(int[] nums) {
    HashMap<Integer, Integer> map = new HashMap<>();
    int k = 0;
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);    
        if(map.get(nums[i]) >= k ) k = map.get(nums[i]);
    }
    int solution= 0;
    for(Map.Entry<Integer, Integer> entry : map.entrySet()){
        if(entry.getValue() == k) solution = entry.getKey();  
    }
    return solution;

    
    
    }
}