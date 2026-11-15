class _14_LC443_StringCompression_Medium {
    public static int compress(char[] chars) {
        int write = 0;
        int read = 0;
        while (read < chars.length) {
            char current = chars[read];
            int start = read;
            while (read < chars.length && chars[read] == current) read++;
            chars[write++] = current;
            int count = read - start;
            if (count > 1) {
                for (char digit : String.valueOf(count).toCharArray()) chars[write++] = digit;
            }
        }
        return write;
    }

    public static void main(String[] args) {
        char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        System.out.println(compress(chars) == 6);
    }
}
