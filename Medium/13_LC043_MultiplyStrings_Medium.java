class _13_LC043_MultiplyStrings_Medium {
    public static String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) return "0";
        int[] digits = new int[num1.length() + num2.length()];
        for (int i = num1.length() - 1; i >= 0; i--) {
            for (int j = num2.length() - 1; j >= 0; j--) {
                int position = i + j + 1;
                int product = (num1.charAt(i) - '0') * (num2.charAt(j) - '0') + digits[position];
                digits[position] = product % 10;
                digits[position - 1] += product / 10;
            }
        }
        StringBuilder result = new StringBuilder();
        int index = 0;
        while (index < digits.length && digits[index] == 0) index++;
        while (index < digits.length) result.append(digits[index++]);
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(multiply("123", "456").equals("56088"));
    }
}
