import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> fizzBuzz(int n) {
        // Create an empty list of strings (just like answer = [] in Python)
        List<String> answer = new ArrayList<>();
        
        // Loop from 1 up to n (inclusive)
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                answer.add("FizzBuzz");
            } else if (i % 3 == 0) {
                answer.add("Fizz");
            } else if (i % 5 == 0) {
                answer.add("Buzz");
            } else {
                // Convert int i to a String (like str(i) in Python)
                answer.add(String.valueOf(i)); 
            }
        }
        
        return answer;
    }
}
