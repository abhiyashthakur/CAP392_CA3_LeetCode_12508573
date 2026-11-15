class _07_LC058_LengthOfLastWord_Easy {
    public static int lengthOfLastWord(String s) {
        int index = s.length() - 1;
        while (index >= 0 && s.charAt(index) == ' ') index--;
        int length = 0;
        while (index >= 0 && s.charAt(index) != ' ') {
            length++;
            index--;
        }
        return length;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World") == 5);
        System.out.println(lengthOfLastWord(" fly me to the moon ") == 4);
    }
}
