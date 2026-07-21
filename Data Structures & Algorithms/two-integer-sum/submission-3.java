class Solution {
    public int[] twoSum(int[] nums, int target) {
     /* brute force solution there is a faster sol with hashmap
        for (int i = 0; i <nums.length; i++){
             for (int j = i+1; j<nums.length; j++){
                if(nums[i] + nums[j] == target){
                return new int[]{i, j};
             }
        }
    } 
    return null;
}

}

    */
 HashMap <Integer, Integer> map = new HashMap<>();

 for (int i = 0; i< nums.length; i++){
    int possibleNumber = target -nums[i];
    if (map.containsKey(possibleNumber)){
        return new int[]{map.get(possibleNumber),i};
 
    }
     map.put(nums[i],i);
 }
 return null;
 
    }
}

    

