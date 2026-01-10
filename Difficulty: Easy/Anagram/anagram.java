class Solution {
    public static boolean areAnagrams(String s1, String s2) {
         if (s1.length() != s2.length()) return false;

        int[] freq = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);

            // If non-lowercase letter appears, not valid
            if (c1 < 'a' || c1 > 'z' || c2 < 'a' || c2 > 'z') {
                return false;
            }

            freq[c1 - 'a']++;
            freq[c2 - 'a']--;
        }

        for (int count : freq) {
            if (count != 0) return false;
        }

        return true;
    }
}