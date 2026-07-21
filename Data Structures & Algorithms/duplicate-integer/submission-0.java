class Solution {
    public boolean hasDuplicate(int[] nums) {
       Set <Integer> d = new HashSet<>();
        for(int i = 0; i< nums.length; i++ ){
            d.add(nums[i]);
        }
        if (d.size() < nums.length){
            return true;
        }
        return false;
    }
}