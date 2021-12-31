public class _87389 {
    public static void main(String[] args) {
        int n = 999998;
        System.out.println(solution(n));
    }

    private static int solution(int n) {
        int min = Integer.MAX_VALUE;
        for (int i = n; i >= 1; i--) {
            if (n % i == 1) {
                min = Math.min(min, i);
            }
        }
        return min;
    }
}
