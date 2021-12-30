public class _12928 {
    public static void main(String[] args) {
        int n = 3000;
        System.out.print(solution(n));
    }

    private static int solution(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
