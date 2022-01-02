public class _12905 {
    public static void main(String[] args) {
        // int[][] board = {{0, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}, {0, 0, 1, 0}};
        int[][] board = {{0, 0, 1, 1}, {1, 1, 1, 1}};
        System.out.print(solution(board));
    }

    private static int solution(int[][] board) {
        int result = 0;
        int[][] map = new int[board.length + 1][board[0].length + 1];
        for (int i = 0; i < board.length; i++) {
            System.arraycopy(board[i], 0, map[i + 1], 1, board[i].length);
        }
        for (int i = 1; i <= board.length; i++) {
            for (int j = 1; j <= board[0].length; j++) {
                if (map[i][j] != 0) {
                    map[i][j] = Math.min(map[i - 1][j - 1], Math.min(map[i - 1][j], map[i][j - 1])) + 1;
                }
                result = Math.max(result, map[i][j]);
            }
        }
        return result * result;
    }
}
