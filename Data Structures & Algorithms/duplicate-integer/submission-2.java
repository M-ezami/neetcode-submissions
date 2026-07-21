class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet <Integer> hash = new HashSet<>();
        
        for (int i = 0; i <= nums.length-1; i++){
                hash.add(nums[i]);
                System.out.println(hash.size());
        }
        
        if(hash.size() == nums.length){
            return false;
        }
        return true;
 

    }
}