class Solution {
    public void reverseString(char[] s) {
        // 1. Turn char[] into a StringBuilder and reverse it
        String reversed = new StringBuilder(new String(s)).reverse().toString();
        
        // 2. Copy the reversed characters back into the original array 's'
        for (int i = 0; i < s.length; i++) {
            s[i] = reversed.charAt(i);
        }
    }
}
