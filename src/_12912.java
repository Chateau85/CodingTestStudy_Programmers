public class _12912 {
    public static void main(String[] args) {
        int a = -1000000, b = 10000000;
        System.out.println(solution(a, b));
    }

    private static long solution(int a, int b) {
        if (a == b) {
            return a;
        }

        if (a == b * -1) {
            return 0;
        }

        long sum = 0;
        int l = Math.min(a, b);
        int r = Math.max(a, b);
        for (int i = l; i <= r; i++) {
            sum += i;
        }
        return sum;
    }
}
