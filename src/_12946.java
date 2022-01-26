import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _12946 {
    static List<int[]> list;

    public static void main(String[] args) {
        int n = 5;
        System.out.println(Arrays.deepToString(solution(n)));
    }

    private static int[][] solution(int n) {
        list = new ArrayList<>();
        towerOfHanoi(n, 1, 3, 2);
        int[][] answer = new int[list.size()][2];

        for (int i = 0; i < list.size(); i++) {
            answer[i][0] = list.get(i)[0];
            answer[i][1] = list.get(i)[1];
        }
        return answer;
    }

    private static void towerOfHanoi(int n, int start, int end, int through) {
        int[] move = {start, end};
        if (n == 1) {
            list.add(move);
        } else {
            towerOfHanoi(n - 1, start, through, end);
            list.add(move);
            towerOfHanoi(n - 1, through, end, start);
        }
    }
}
