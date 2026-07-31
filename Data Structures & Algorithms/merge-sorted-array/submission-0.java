class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int nums2Pointer = 0;
        for (int i = m; i< nums1.length; i++ ){
            nums1[i]= nums2[nums2Pointer];
            nums2Pointer++;
            
        }
        Arrays.sort(nums1);
    }
}