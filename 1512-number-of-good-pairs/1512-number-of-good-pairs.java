class Solution {
    public int numIdenticalPairs(int[] nums) {
        int i;
        int j;
        int count=0;
        for(i=0;i<nums.length;i++){
            for(j=nums.length-1;j>i;j--){           
                if(nums[i]==nums[j] && i<j){
                    count++;
                }    
            }

        }
        return count;
    }
}