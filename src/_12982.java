import java.util.Arrays;

public class _12982 {
    public static void main(String[] args) {
        // int[] d = {1, 3, 2, 5, 4};         int budget = 9;
        int[] d = {2, 2, 3, 3};
        int budget = 10;
        System.out.print(solution(d, budget));
    }

    private static int solution(int[] d, int budget) {
        Arrays.sort(d);
        int count = 0;
        for (int j : d) {
            if (budget - j >= 0) {
                budget -= j;
                count++;
            } else {
                break;
            }
        }
        return count;
    }
}
