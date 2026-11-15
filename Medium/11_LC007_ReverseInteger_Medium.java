class _11_LC007_ReverseInteger_Medium {
    public static int reverse(int x) {
        int result = 0;
        while (x != 0) {
            int digit = x % 10;
            x /= 10;
            if (result > Integer.MAX_VALUE / 10
                    || result < Integer.MIN_VALUE / 10
                    || (result == Integer.MAX_VALUE / 10 && digit > 7)
                    || (result == Integer.MIN_VALUE / 10 && digit < -8)) return 0;
            result = result * 10 + digit;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(reverse(123) == 321);
        System.out.println(reverse(-123) == -321);
        System.out.println(reverse(1534236469) == 0);
    }
}
