import java.util.Arrays;

public class _12935 {
    public static void main(String[] args) {
        // int[] arr = {4, 3, 2, 1};
        int[] arr = {10};
        System.out.println(Arrays.toString(solution(arr)));
    }

    private static int[] solution(int[] arr) {
        if (arr.length == 1) {
            return new int[]{-1};
        }

        int[] result = new int[arr.length - 1];
        int min = Integer.MAX_VALUE;
        for (int j : arr) {
            if (min > j) {
                min = j;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != min) {
                result[i] = arr[i];
            }
        }
        return result;
    }
}
