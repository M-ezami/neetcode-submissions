class Solution {
    public int[] getConcatenation(int[] nums) {
        int twoXNums = nums.length*2;
        int[] arr = new int[twoXNums];
       
        for (int i = 0; i<nums.length;i++){
            arr[i]=nums[i];
            arr[i + nums.length]= nums[i];
        }

        return arr;
}
}