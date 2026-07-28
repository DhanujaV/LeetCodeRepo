class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int maxSum=0;
        int currentMax=0;
        int minSum=0;
        int currentMin=0;
        for(int num:nums){
            currentMax=Math.max(num,num+currentMax);
            maxSum=Math.max(maxSum,currentMax);
            currentMin=Math.min(num,num+currentMin);
            minSum=Math.min(minSum,currentMin);
        }
        return Math.max(Math.abs(maxSum),Math.abs(minSum));
        
    }
}