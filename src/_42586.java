import java.util.*;

public class _42586 {
    public static void main(String[] args) {
        // int[] progresses = {93, 30, 55}, speeds = {1, 30, 5};
        int[] progresses = {95, 90, 99, 99, 80, 99}, speeds = {1, 1, 1, 1, 1, 1};
        System.out.print(Arrays.toString(solution(progresses, speeds)));
    }

    private static int[] solution(int[] progresses, int[] speeds) {
        int[] day = new int[101];
        int[] works = new int[progresses.length];
        for (int i = 0; i < progresses.length; i++) {
            int proc = (int) Math.ceil((100 - progresses[i]) / (speeds[i] * 1.0));
            works[i] = i > 0 && proc < works[i - 1] ? works[i - 1] : proc;
            day[works[i]]++;
        }

        int resultSize = 0;
        for (int j : day) {
            if (j != 0) {
                resultSize++;
            }
        }
        int[] result = new int[resultSize];
        int resultIndex = 0;
        for (int j : day) {
            if (j != 0) {
                result[resultIndex++] = j;
            }
        }
        return result;
    }
}
