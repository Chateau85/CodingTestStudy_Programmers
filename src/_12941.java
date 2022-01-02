import java.util.Arrays;

public class _12941 {
    public static void main(String[] args) {
        int[] A = {1, 4, 2};
        int[] B = {5, 4, 4};
        // int[] A = {1, 2};         int[] B = {3, 4};
        System.out.println(solution(A, B));
    }

    private static int solution(int[] a, int[] b) {
        int result = 0;
        Arrays.sort(a);
        Arrays.sort(b);
        for (int i = 0; i < a.length; i++) {
            result += a[i] * b[b.length - i - 1];
        }
        return result;
    }
}
