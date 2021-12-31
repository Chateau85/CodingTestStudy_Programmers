public class _77884 {
    public static void main(String[] args) {
        int left = 24, right = 27;
        System.out.print(solution(left, right));
    }

    private static int solution(int left, int right) {
        int result = 0;

        for (int i = left; i <= right; i++) {
            result += totalCdSum(i) ? i : -i;
        }

        return result;
    }

    private static boolean totalCdSum(int v) {
        int count = 0;
        for (int i = 1; i <= v; i++) {
            if (v % i == 0) {
                count++;
            }
        }
        return count % 2 == 0;
    }
}
