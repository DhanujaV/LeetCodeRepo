class Solution {
    public int maxProduct(int[] nums) {
        int largest=nums[0];
        
        for(int i=0;i<nums.length;i++){
            int product=1;
            for(int j=i;j<nums.length;j++){
                product*=nums[j];
                largest=Math.max(largest,product);
            }
           
            
        }
        return largest;
        
    }
}