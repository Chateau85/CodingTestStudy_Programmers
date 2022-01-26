public class _12907 {
    public static void main(String[] args) {
        int n = 5;
        int[] money = {1, 2, 5};
        System.out.println(solution(n, money));
    }

    private static int solution(int n, int[] money) {
        int answer = 0;

        long[] dp = new long[n + 1];
        for (int i = 0; i <= n; i++) {
            if (i % money[0] == 0) {
                dp[i] = 1;
            }
        }
        for (int i = 1; i < money.length; i++) {
            for (int j = money[i]; j <= n; j++) {
                dp[j] += dp[j - money[i]] % 1000000007;
            }
        }
        answer = (int) dp[n] % 1000000007;
        return answer;
    }
}
