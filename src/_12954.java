import java.util.Arrays;
import java.util.Scanner;

public class _12954 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(Arrays.toString(solution(x, n)));
    }

    private static long[] solution(int x, int n) {
        long[] answer = new long[n];
        for (int i = 0; i < n; i++) {
            answer[i] = ((long) x * (i + 1));
        }
        return answer;
    }
}
