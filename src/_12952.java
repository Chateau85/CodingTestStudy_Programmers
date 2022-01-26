public class _12952 {
    static int N;
    static int answer = 0;

    public static void main(String[] args) {
        int n = 12;
        System.out.println(solution(n));
    }

    private static int solution(int n) {
        N = n;
        for (int i = 1; i <= n; i++) {
            int[] map = new int[n + 1];
            map[1] = i;
            dfs(map, 1);
        }
        return answer;
    }

    private static void dfs(int[] map, int row) {
        if (row == N) {
            answer++;
        } else {
            for (int col = 1; col <= N; col++) {
                map[row + 1] = col;
                if (check(map, row + 1)) {
                    dfs(map, row + 1);
                }
            }
        }
    }

    private static boolean check(int[] map, int row) {
        for (int i = 1; i < row; i++) {
            if (map[i] == map[row]) {
                return false;
            }
            if (Math.abs(i - row) == Math.abs(map[i] - map[row])) {
                return false;
            }
        }
        return true;
    }
}
