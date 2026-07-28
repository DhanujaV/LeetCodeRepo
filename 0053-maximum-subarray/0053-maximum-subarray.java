class Solution {
    public int maxSubArray(int[] nums) {
        int global_sum=nums[0];
        int current_sum=nums[0];
        for(int i=1;i<nums.length;i++){
            current_sum=Math.max(current_sum+nums[i],nums[i]);
            global_sum=Math.max(current_sum,global_sum);

        }
        return global_sum;
        
    }
}