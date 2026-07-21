class Solution {
    public int alternateDigitSum(int n) {
        int sum=0;
        int sign=1;    //1=>pos,-1=>neg
        while(n>0){
            int digit=n%10;
            sum+=sign*digit;
            sign=-sign;
            n/=10;
        };
        return -sign*sum;
       
        
    }
}