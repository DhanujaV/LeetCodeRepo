class Solution {
    public String[] findWords(String[] words) {
        
        String[] rows = {
            "qwertyuiop",
            "asdfghjkl",
            "zxcvbnm"
        };

        java.util.ArrayList<String> ans = new java.util.ArrayList<>();

        for (String word : words) {
            String w = word.toLowerCase();

            int row = -1;

            for (int r = 0; r < 3; r++) {
                if (rows[r].indexOf(w.charAt(0)) != -1) {
                    row = r;
                    break;
                }
            }

            boolean valid = true;

            for (int i = 1; i < w.length(); i++) {
                if (rows[row].indexOf(w.charAt(i)) == -1) {
                    valid = false;
                    break;
                }
            }

            if (valid) {
                ans.add(word);
            }
        }

        return ans.toArray(new String[0]);
    }
}