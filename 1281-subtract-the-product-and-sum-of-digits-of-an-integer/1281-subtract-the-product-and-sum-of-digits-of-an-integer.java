class Solution {
    public int subtractProductAndSum(int n) {
        int temp=0;
        int mul=1;
        int sum=0;
        while(n>0){
            int digit=n%10;
            sum=digit*1+sum;
            mul=digit*1*mul;
            n=n/10;

        }
        return mul-sum;
        

        
    }
}