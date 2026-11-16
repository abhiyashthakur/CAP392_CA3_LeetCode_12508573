import java.util.HashMap;
import java.util.Map;

class Solution {
    public int romanToInt(String s) {
        // 1. Store the 7 symbols in a HashMap
        Map<Character, Integer> roman = new HashMap<>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);
        
        // 2. Replace the 6 subtraction pairs
        s = s.replace("IV", "IIII").replace("IX", "VIIII");
        s = s.replace("XL", "XXXX").replace("XC", "LXXXX");
        s = s.replace("CD", "CCCC").replace("CM", "DCCCC");
        
        // 3. Loop through and sum them up
        int total = 0;
        for (char c : s.toCharArray()) {
            total += roman.get(c);
        }
        
        return total;
    }
}
