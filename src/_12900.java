public class _12900 {
    public static void main(String[] args) {
        int n = 60000;
        System.out.println(solution(n));
    }

    private static int solution(int n) {
        int a = 1, b = 1;
        for (int i = 0; i < n - 1; i++) {
            int c = (a + b) % 1000000007;
            a = b;
            b = c;
        }
        return b;
    }
}
