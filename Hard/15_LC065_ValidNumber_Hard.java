class Solution {
    public boolean isNumber(String s) {
        // 1. Reject "Infinity", "NaN", or Java float/double suffixes like 'f', 'd', 'F', 'D'
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c) && c != 'e' && c != 'E') {
                return false;
            }
        }
        
        // 2. Let Java's built-in parser do all the hard work!
        try {
            Double.parseDouble(s);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
