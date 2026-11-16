import java.util.Arrays;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        // 1. Sort the array alphabetically
        Arrays.sort(strs);
        
        // 2. Grab the first and last strings
        String first = strs[0];
        String last = strs[strs.length - 1];
        
        // 3. Compare characters from the start
        int i = 0;
        while (i < first.length() && i < last.length()) {
            if (first.charAt(i) == last.charAt(i)) {
                i++;
            } else {
                break;
            }
        }
        
        // 4. Return the matching slice from index 0 to i
        return first.substring(0, i);
    }
}
