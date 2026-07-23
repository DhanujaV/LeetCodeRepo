class Solution {
    public int vowelConsonantScore(String s) {
        int vcount=0;
        int ccount=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='a'&& ch<='z'){           
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                    vcount++;

                }
                else{
                    ccount++;
                }
            }
        }
        if(ccount==0){
            return 0;
        }

        return vcount/ccount;
        
    }
}