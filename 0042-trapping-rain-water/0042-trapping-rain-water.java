class Solution {
    public int trap(int[] height) {
        int l=0;
        int r=height.length-1;
        int tcap=0;
        int lmax=height[0],rmax=height[height.length-1];
        while(l<r){
            if(lmax<rmax){
                l++;
                lmax=Math.max(lmax,height[l]);
                tcap+=(lmax-height[l]);
            }
            else{
                r--;
                rmax=Math.max(rmax,height[r]);
                tcap+=(rmax-height[r]);
            }
        }
        return tcap;


        
    }
}