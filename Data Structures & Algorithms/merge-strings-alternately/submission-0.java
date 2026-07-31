class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sB = new StringBuilder();

        char[] charsOne = word1.toCharArray();
        char[] charsTwo = word2.toCharArray();

        int min = Math.min(charsOne.length, charsTwo.length);
        int max = Math.max(charsOne.length, charsTwo.length);

        boolean word1IsSmaller = charsOne.length < charsTwo.length;

        for (int i = 0; i < min; i++) {
            sB.append(charsOne[i]);
            sB.append(charsTwo[i]);
        }

        for (int j = min; j < max; j++) {
            if (word1IsSmaller) {
                sB.append(charsTwo[j]);
            } else {
                sB.append(charsOne[j]);
            }
        }

        return sB.toString();
    }
}