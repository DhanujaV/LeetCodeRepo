class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int current=1;
        int max=1;
        if(nums.length==0){
            return 0;
        }
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                current++;
            }
            else{
                current=1;
            }
            max=Math.max(current,max);
        }
        return max;
        
        
    }
}