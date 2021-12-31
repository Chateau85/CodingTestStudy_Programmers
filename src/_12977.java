public class _12977 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 7, 6, 4};
        System.out.println(solution(nums));
    }

    private static int solution(int[] nums) {
        int result = 0;

        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (isPrime(nums[i] + nums[j] + nums[k])) {
                        result++;
                    }
                }
            }
        }

        return result;
    }

    private static boolean isPrime(int x) {
        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
}
