class Solution {
    public String multiply(String num1, String num2) {
        // Quick check: anything multiplied by "0" is "0"
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }

        int n = num1.length();
        int m = num2.length();
        int[] result = new int[n + m];

        // Multiply every digit from right to left (just like on paper)
        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {
                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                
                // Add to whatever is already in that slot
                int sum = mul + result[i + j + 1];

                result[i + j + 1] = sum % 10; // Ones place stays here
                result[i + j] += sum / 10;    // Carry goes one slot to the left
            }
        }

        // Convert the array of digits into a String
        StringBuilder sb = new StringBuilder();
        for (int digit : result) {
            // Skip leading zeros at the very front of the array
            if (sb.length() == 0 && digit == 0) {
                continue;
            }
            sb.append(digit);
        }

        return sb.toString();
    }
}
