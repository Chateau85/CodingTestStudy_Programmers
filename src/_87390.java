import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _87390 {
    public static void main(String[] args) {
        int n = 4, left = 7, right = 14;
        // int n = 3, left = 2, right = 5;
        System.out.println(Arrays.toString(solution(n, left, right)));
    }

    private static int[] solution(int n, long left, long right) {
        int[] answer;

        List<Integer> list = new ArrayList<>();
        while (left <= right) {
            int r = (int) Math.floor(left / n);
            int c = (int) (left++ % n);
            list.add(Math.max(r, c) + 1);
        }

        answer = new int[list.size()];
        int index = 0;
        for (int t : list) {
            answer[index++] = t;
        }
        return answer;
    }
}
