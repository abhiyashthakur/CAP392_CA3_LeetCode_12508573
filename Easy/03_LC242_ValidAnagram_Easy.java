import java.util.Arrays;

class Solution {
    public boolean isAnagram(String s, String t) {
        // Quick check: different lengths can never be anagrams
        if (s.length() != t.length()) {
            return false;
        }
        
        // 1. Convert strings to character arrays
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        
        // 2. Sort both arrays alphabetically
        Arrays.sort(sArray);
        Arrays.sort(tArray);
        
        // 3. Compare the sorted arrays
        return Arrays.equals(sArray, tArray);
    }
}
