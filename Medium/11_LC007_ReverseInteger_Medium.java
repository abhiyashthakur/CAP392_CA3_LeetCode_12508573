class Solution {
    public int reverse(int x) {
        // 1. Remember if it was negative
        int sign = (x < 0) ? -1 : 1;

        // 2. Convert to positive string (Math.abs(x) fails on Integer.MIN_VALUE, so strip '-' from string)
        String s = String.valueOf(x).replace("-", "");

        // 3. Reverse the string just like s[::-1] in Python
        String reversed = new StringBuilder(s).reverse().toString();

        // 4. Parse back to int — if it overflows 32-bit, catch it and return 0!
        try {
            return Integer.parseInt(reversed) * sign;
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}
