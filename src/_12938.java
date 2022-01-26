import java.util.Arrays;

public class _12938 {
    public static void main(String[] args) {
        int n = 2, s = 9;
        System.out.println(Arrays.toString(solution(n, s)));
    }

    private static int[] solution(int n, int s) {
        if (n > s) {
            return new int[]{-1};
        }
        int[] answer = new int[n];

        int v = s / n;
        int w = s % n;
        for (int i = 0; i < n; i++) {
            if (i >= n - w) {
                answer[i] = v + 1;
            } else {
                answer[i] = v;
            }
        }

        return answer;
    }
}
