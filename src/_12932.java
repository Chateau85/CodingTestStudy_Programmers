import java.util.Arrays;

public class _12932 {
    public static void main(String[] args) {
        // long n = 12345;
        long n = 12345678910L;
        System.out.println(Arrays.toString(solution(n)));
    }

    private static int[] solution(long n) {
        int size = 0;
        long proc = n;
        while (proc > 0) {
            proc /= 10;
            size++;
        }

        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = (int) (n % 10);
            n /= 10;
        }
        return result;
    }
}
