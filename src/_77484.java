import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class _77484 {
    public static void main(String[] args) {
        int[] lottos = {44, 1, 0, 0, 31, 25}, win_nums = {31, 10, 45, 1, 6, 19};
        // int[] lottos = {0, 0, 0, 0, 0, 0}, win_nums = {38, 19, 20, 40, 15, 25};
        // int[] lottos = {45, 4, 35, 20, 3, 9}, win_nums = {20, 9, 3, 45, 4, 35};
        // int[] lottos = {1, 2, 3, 4, 5, 6}, win_nums = {7, 8, 9, 10, 11, 12};
        System.out.println(Arrays.toString(solution(lottos, win_nums)));
    }

    private static int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int min = 0;
        int max = 0;

        Set<Integer> set = new HashSet<>();
        for (int n : win_nums) {
            set.add(n);
        }
        for (int l : lottos) {
            if (l == 0) {
                max++;
                continue;
            }
            if (set.contains(l)) {
                max++;
                min++;
            }
        }

        answer[0] = max == 0 ? 6 : 7 - max;
        answer[1] = min == 0 ? 6 : 7 - min;

        return answer;
    }
}
