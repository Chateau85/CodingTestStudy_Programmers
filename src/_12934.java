public class _12934 {
    public static void main(String[] args) {
        long n = 50000000000000L;
        System.out.println(solution(n));
    }

    private static long solution(long n) {
        if (n == 1) {
            return 4;
        }

        long answer = 0;
        for (long i = 0; i * i <= n; i++) {
            answer = i * i == n ? (i + 1) * (i + 1) : -1;
        }
        return answer;
    }
}
