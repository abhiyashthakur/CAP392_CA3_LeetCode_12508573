class _15_LC065_ValidNumber_Hard {
    public static boolean isNumber(String s) {
        s = s.trim();
        if (s.isEmpty()) return false;
        boolean digitSeen = false;
        boolean digitAfterExponent = true;
        boolean exponentSeen = false;
        boolean decimalSeen = false;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                digitSeen = true;
                digitAfterExponent = true;
            } else if (c == '.') {
                if (decimalSeen || exponentSeen) return false;
                decimalSeen = true;
            } else if (c == 'e' || c == 'E') {
                if (exponentSeen || !digitSeen) return false;
                exponentSeen = true;
                digitAfterExponent = false;
            } else if (c == '+' || c == '-') {
                if (i != 0 && s.charAt(i - 1) != 'e' && s.charAt(i - 1) != 'E') return false;
            } else {
                return false;
            }
        }
        return digitSeen && digitAfterExponent;
    }

    public static void main(String[] args) {
        System.out.println(isNumber("2"));
        System.out.println(isNumber("e"));
        System.out.println(isNumber("-90E3"));
    }
}
