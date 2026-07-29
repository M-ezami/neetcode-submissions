class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        int counter = -1;

        for (char c : strs[0].toCharArray()) {
            counter++;

            for (int i = 1; i < strs.length; i++) {
                if (counter >= strs[i].length() || strs[i].charAt(counter) != c) {
                    return sb.toString();
                }
            }

            sb.append(c);
        }

        return sb.toString();
    }
}