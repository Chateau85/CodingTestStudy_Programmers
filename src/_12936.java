import java.util.*;

public class _12936 {
    public static void main(String[] args) {
        int n = 4, k = 6;
        System.out.println(Arrays.toString(solution(n, k)));
    }

    private static int[] solution(int n, int k) {
        int[] answer = new int[n];

        List<Integer> list = new ArrayList<>();
        long fn = 1;
        for (int i = 1; i <= n; i++) {
            list.add(i);
            fn *= i;
        }
        k--;

        int index = 0;
        while (n > 0) {
            fn /= n;
            answer[index++] = list.get((int) (k / fn));
            list.remove((int) (k / fn));
            k %= fn;
            n--;
        }

        return answer;
    }
}
