public class _70128 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4}, b = {-3, -1, 0, 2};
        System.out.println(solution(a, b));
    }

    private static int solution(int[] a, int[] b) {
        int result = 0;
        for (int i = 0; i < a.length; i++) {
            result += a[i] * b[i];
        }
        return result;
    }
}
