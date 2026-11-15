import java.util.Arrays;

class _09_LC344_ReverseString_Easy {
    public static void reverseString(char[] s) {
        for (int left = 0, right = s.length - 1; left < right; left++, right--) {
            char temporary = s[left];
            s[left] = s[right];
            s[right] = temporary;
        }
    }

    public static void main(String[] args) {
        char[] value = {'h', 'e', 'l', 'l', 'o'};
        reverseString(value);
        System.out.println(Arrays.equals(value, new char[]{'o', 'l', 'l', 'e', 'h'}));
    }
}
