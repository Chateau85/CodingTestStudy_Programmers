import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class _42748 {
    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        System.out.println(Arrays.toString(solution(array, commands)));
    }

    private static int[] solution(int[] array, int[][] commands) {
        int[] result = new int[commands.length];
        int index = 0;
        List<Integer> procList = new ArrayList<>();
        for (int[] command : commands) {
            int start = command[0];
            int end = command[1];
            int pick = command[2];

            for (int j = start; j <= end; j++) {
                procList.add(array[j - 1]);
            }

            Collections.sort(procList);
            result[index++] = procList.size() < 2 ? procList.get(0) : procList.get(pick - 1);
            procList = new ArrayList<>();
        }
        return result;
    }
}
