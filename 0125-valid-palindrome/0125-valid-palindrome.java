class Solution {
    public boolean isPalindrome(String s) {

        String s1 = s.toLowerCase();
        int left = 0;
        int right = s1.length() - 1;

        while (left < right) {

            while (left < right &&
                  !((s1.charAt(left) >= 'A' && s1.charAt(left) <= 'Z') ||
                    (s1.charAt(left) >= 'a' && s1.charAt(left) <= 'z') ||
                    (s1.charAt(left) >= '0' && s1.charAt(left) <= '9'))) {
                left++;
            }

            while (left < right &&
                  !((s1.charAt(right) >= 'A' && s1.charAt(right) <= 'Z') ||
                    (s1.charAt(right) >= 'a' && s1.charAt(right) <= 'z') ||
                    (s1.charAt(right) >= '0' && s1.charAt(right) <= '9'))) {
                right--;
            }

            if (s1.charAt(left) != s1.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}