class Solution {
    public String reverseWords(String s) {
        // 1. Remove leading and trailing spaces, then split by 1 or more spaces
        String[] words = s.trim().split("\\s+");
        
        // 2. Append words in reverse order using StringBuilder
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i > 0) {
                sb.append(" ");
            }
        }
        
        return sb.toString();
    }
}
