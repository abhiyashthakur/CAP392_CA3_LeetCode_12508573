class _12_LC151_ReverseWordsInString_Medium {
    public static String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        int index = s.length() - 1;
        while (index >= 0) {
            while (index >= 0 && s.charAt(index) == ' ') index--;
            if (index < 0) break;
            int end = index;
            while (index >= 0 && s.charAt(index) != ' ') index--;
            if (result.length() > 0) result.append(' ');
            result.append(s, index + 1, end + 1);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("the sky is blue").equals("blue is sky the"));
    }
}
