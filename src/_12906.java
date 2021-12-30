import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _12906 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 3, 0, 1, 1};
        System.out.println(Arrays.toString(solution(arr)));
    }

    private static int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int num = -1;
        for (int j : arr) {
            if (num != j) {
                num = j;
                list.add(j);
            }
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}
