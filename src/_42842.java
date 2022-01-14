import java.util.Arrays;

public class _42842 {
    public static void main(String[] args) {
        // int brown = 10, yellow = 2;
        // int brown = 24, yellow = 24;
        int brown = 8, yellow = 1;
        System.out.println(Arrays.toString(solution(brown, yellow)));
    }

    private static int[] solution(int brown, int yellow) {
        int[] answer = new int[2];

        int xy = brown + yellow;
        for (int i = 1; i <= xy; i++) {
            int v1 = xy % i;
            int v2 = xy / i;
            if (v1 == 0 && v2 >= i && (v2 - 2) * (i - 2) == yellow) {
                answer[0] = v2;
                answer[1] = i;
            }
        }

        return answer;
    }
}
