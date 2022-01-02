import java.util.Arrays;

public class _12949 {
    public static void main(String[] args) {
        int[][] arr1 = {{2, 3, 2},
                {4, 2, 4},
                {3, 1, 4}};
        int[][] arr2 = {{5, 4, 3},
                {2, 4, 1},
                {3, 1, 1}};
        System.out.println(Arrays.deepToString(solution(arr1, arr2)));
    }

    private static int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] result = new int[arr1.length][arr2.length];
        int sum = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2[0].length; j++) {
                for (int k = 0; k < arr2.length; k++) {
                    sum += arr1[i][k] * arr2[k][j];
                }
                result[i][j] = sum;
                sum = 0;
            }
        }
        return result;
    }
}
