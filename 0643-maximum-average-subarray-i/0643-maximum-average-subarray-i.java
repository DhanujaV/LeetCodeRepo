class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int cs=0;
		for(int i=0;i<k;i++) {
			cs+=nums[i];
            
		}
		int gs=cs;
		for(int i=k;i<nums.length;i++) {
			cs=cs-nums[i-k]+nums[i];
			gs=Math.max(cs, gs);
		}
		return (double)gs/k;
    }
}