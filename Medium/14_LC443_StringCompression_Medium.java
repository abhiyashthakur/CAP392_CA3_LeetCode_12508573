class Solution {
    public int compress(char[] chars) {
        StringBuilder sb = new StringBuilder();
        int i = 0;

        while (i < chars.length) {
            char currentChar = chars[i];
            int count = 0;

            // Count how many times currentChar repeats in a row
            while (i < chars.length && chars[i] == currentChar) {
                count++;
                i++;
            }

            // 1. Append the letter
            sb.append(currentChar);

            // 2. If it repeated more than once, append the number too
            if (count > 1) {
                sb.append(count); // Automatically splits 12 into '1' and '2'!
            }
        }

        // 3. Copy our compressed string back into the original 'chars' array
        for (int j = 0; j < sb.length(); j++) {
            chars[j] = sb.charAt(j);
        }

        return sb.length();
    }
}
