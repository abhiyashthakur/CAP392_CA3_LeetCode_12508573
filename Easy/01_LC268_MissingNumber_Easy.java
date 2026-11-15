import java.util.Arrays;

class _01_LC268_MissingNumber_Easy {
    public static int missingNumber(int[] nums) {
        int result = nums.length;
        for (int i = 0; i < nums.length; i++) {
            result ^= i ^ nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(missingNumber(new int[]{3, 0, 1}) == 2);
        System.out.println(missingNumber(new int[]{0, 1}) == 2);
        System.out.println(Arrays.toString(new int[]{1, 2, 3}));
    }
}
