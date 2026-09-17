class Solution {
    public String getHint(String secret, String guess) {
        int bull=0;
        int cow=0;
        int[] secretCount=new int[10];
        int[] guessCount=new int[10];
        for(int i=0;i<secret.length();i++){
            if(secret.charAt(i)==guess.charAt(i)){
                bull++;
            }
            else{
                secretCount[secret.charAt(i)-'0']++;
                guessCount[guess.charAt(i)-'0']++;
            }
        }
        for(int i=0;i<10;i++){
            cow+=Math.min(secretCount[i],guessCount[i]);
        }
        return bull+"A"+cow+"B";
        
    }
}