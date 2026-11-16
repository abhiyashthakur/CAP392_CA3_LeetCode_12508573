class Solution {
    public int lengthOfLastWord(String s) {
        // 1. Remove leading/trailing spaces and split by spaces
        String[] words = s.trim().split(" ");
        
        // 2. Return the length of the very last word in the array
        return words[words.length - 1].length();
    }
}
