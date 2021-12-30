import java.util.Arrays;

public class _12910 {
    public static void main(String[] args) {
        // int[] arr = {2, 36, 1, 3};         int divisor = 1;
        int[] arr = {3, 2, 6, 55};
        int divisor = 10;
        System.out.println(Arrays.toString(solution(arr, divisor)));
    }

    private static int[] solution(int[] arr, int divisor) {
        int size = 0;
        for (int i : arr) {
            if (i % divisor == 0) {
                size++;
            }
        }

        if (size == 0) {
            return new int[]{-1};
        }

        int[] result = new int[size--];
        for (int j : arr) {
            if (j % divisor == 0) {
                result[size--] = j;
            }
        }
        Arrays.sort(result);
        return result;
    }
}
