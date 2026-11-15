import java.util.Map;

class _04_LC013_RomanToInteger_Easy {
    private static final Map<Character, Integer> VALUES = Map.of(
            'I', 1, 'V', 5, 'X', 10, 'L', 50,
            'C', 100, 'D', 500, 'M', 1000);

    public static int romanToInt(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            int current = VALUES.get(s.charAt(i));
            if (i + 1 < s.length() && current < VALUES.get(s.charAt(i + 1))) result -= current;
            else result += current;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV") == 1994);
    }
}
