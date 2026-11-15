import java.util.ArrayList;
import java.util.List;

class _16_LC068_TextJustification_Hard {
    public static List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<>();
        int index = 0;
        while (index < words.length) {
            int end = index;
            int letters = 0;
            while (end < words.length
                    && letters + words[end].length() + (end - index) <= maxWidth) {
                letters += words[end].length();
                end++;
            }
            int gaps = end - index - 1;
            StringBuilder line = new StringBuilder();
            if (end == words.length || gaps == 0) {
                for (int i = index; i < end; i++) {
                    if (i > index) line.append(' ');
                    line.append(words[i]);
                }
                while (line.length() < maxWidth) line.append(' ');
            } else {
                int spaces = (maxWidth - letters) / gaps;
                int extra = (maxWidth - letters) % gaps;
                for (int i = index; i < end; i++) {
                    if (i > index) {
                        line.append(" ".repeat(spaces + (i - index <= extra ? 1 : 0)));
                    }
                    line.append(words[i]);
                }
            }
            result.add(line.toString());
            index = end;
        }
        return result;
    }

    public static void main(String[] args) {
        String[] words = {"This", "is", "an", "example", "of", "text", "justification."};
        System.out.println(fullJustify(words, 16));
    }
}
