import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<>();
        List<String> currentLine = new ArrayList<>();
        int numOfLetters = 0;

        for (String word : words) {
            // If adding the next word + minimum 1 space per gap exceeds maxWidth,
            // it's time to justify and save the currentLine!
            if (numOfLetters + word.length() + currentLine.size() > maxWidth) {
                int spacesToDistribute = maxWidth - numOfLetters;
                int gaps = currentLine.size() - 1;

                // Edge Case: Only 1 word on the line -> pad all spaces at the end
                if (gaps == 0) {
                    result.add(currentLine.get(0) + " ".repeat(spacesToDistribute));
                } else {
                    // Round-Robin: hand out 1 space at a time to each word (except the last)
                    int i = 0;
                    while (spacesToDistribute > 0) {
                        currentLine.set(i, currentLine.get(i) + " ");
                        i = (i + 1) % gaps; // Wrap back around to the first gap
                        spacesToDistribute--;
                    }
                    // Join the padded words into a single string
                    result.add(String.join("", currentLine));
                }

                // Reset for the next line
                currentLine.clear();
                numOfLetters = 0;
            }

            // Add the word to the current line
            currentLine.add(word);
            numOfLetters += word.length();
        }

        // Last Line Rule: join with a single space and pad the rest on the right!
        String lastLine = String.join(" ", currentLine);
        int trailingSpaces = maxWidth - lastLine.length();
        result.add(lastLine + " ".repeat(trailingSpaces));

        return result;
    }
}
