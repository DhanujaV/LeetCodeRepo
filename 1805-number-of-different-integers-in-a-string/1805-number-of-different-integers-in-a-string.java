class Solution {
    public int numDifferentIntegers(String word) {
        HashSet<String> set=new HashSet<>();
        int i=0;
        while (i < word.length()) {

          
            while (i < word.length() &&
                !(word.charAt(i) >= '0' && word.charAt(i) <= '9')) {
                i++;
            }

           
            if (i == word.length()) {
                break;
            }

           
            while (i < word.length() &&
                   word.charAt(i) == '0') {
                i++;
            }

            StringBuilder num = new StringBuilder();

           
            while (i < word.length() &&
                  (word.charAt(i) >= '0' && word.charAt(i) <= '9')) {
                num.append(word.charAt(i));
                i++;
            }

           
            if (num.length() == 0) {
                set.add("0");
            } else {
                set.add(num.toString());
            }
        }

        return set.size();
    }
        
   
}