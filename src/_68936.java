import java.util.Arrays;

public class _68936 {
    static int[] answer;

    public static void main(String[] args) {
        int[][] arr = {{1, 1, 0, 0}, {1, 0, 0, 0}, {1, 0, 0, 1}, {1, 1, 1, 1}};
        System.out.println(Arrays.toString(solution(arr)));
    }

    private static int[] solution(int[][] arr) {
        answer = new int[2];
        divide(arr, arr.length, 0, 0);
        return answer;
    }

    private static void divide(int[][] arr, int n, int c, int r) {
        if (n == 1) {
            answer[arr[r][c]]++;
        } else {
            int value = checkRec(n, r, c, arr);
            if (value != -1) {
                answer[value]++;
            } else {
                divide(arr, n / 2, c, r);
                divide(arr, n / 2, c + n / 2, r);
                divide(arr, n / 2, c, r + n / 2);
                divide(arr, n / 2, c + n / 2, r + n / 2);
            }
        }
    }

    public static int checkRec(int n, int y, int x, int[][] arr) {
        int v = arr[y][x];
        for (int i = y; i < y + n; i++) {
            for (int j = x; j < x + n; j++) {
                if (v != arr[i][j]) {
                    return -1;
                }
            }
        }

        return v;
    }
}
