class Solution {
    public boolean isPalindrome(String s) {
        
        char[] chars = s.toLowerCase()
                        .replaceAll("[^a-z0-9]", "")
                        .toCharArray();

        for (int i = 0; i < chars.length / 2; i++) {
            if (chars[i] != chars[chars.length - 1 - i]) {
                return false;
            }
        }

        return true;
    }
}