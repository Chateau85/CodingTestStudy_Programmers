import java.util.Arrays;
import java.util.Comparator;

public class _4580 {
    public static void main(String[] args) {
        int n = 50;
        // int n = 20;
        int[][] battery = {{10, 100000}, {4, 35000}, {1, 15000}};
        //int[][] battery = {{6, 30000}, {3, 18000}, {4, 28000}, {1, 9500}};
        System.out.println(solution(n, battery));
    }

    private static int solution(int n, int[][] battery) {
        int answer = 0;

        int[] dp = new int[n + 1];
        dp[0] = 0;
        Arrays.sort(battery, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return Integer.compare(o1[0], o2[0]);
            }
        });
        for (int i = 1; i < dp.length; i++) {
            if (i % battery[0][0] == 0) {
                dp[i] = battery[0][1];
            }
        }

        for (int i = 1; i < battery.length; i++) {
            for (int j = battery[i][0]; j <= n; j++) {
                dp[j] += dp[j - battery[i][0]];
            }
        }


        answer = dp[n];
        return answer;
    }
}
