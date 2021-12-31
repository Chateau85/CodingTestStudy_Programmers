import java.util.Stack;

public class _64061 {
    public static void main(String[] args) {
        int[][] board = {{0, 0, 0, 0, 0},
                {0, 0, 1, 0, 3},
                {0, 2, 5, 0, 1},
                {4, 2, 4, 4, 2},
                {3, 5, 1, 3, 1}}; // 4 3 1 1 3 2 0 4
        int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};
        System.out.println(solution(board, moves));
    }

    private static int solution(int[][] board, int[] moves) {
        int result = 0;
        Stack<Integer> st = new Stack<>();
        for (int location : moves) {
            location = location - 1;
            if (board[board.length - 1][location] != 0) {
                for (int[] ints : board) {
                    if (ints[location] != 0) {
                        if (st.empty()) {
                            st.add(ints[location]);
                            break;
                        } else {
                            if (st.peek() != ints[location]) {
                                st.add(ints[location]);
                            } else {
                                st.pop();
                                result += 2;
                            }
                        }
                    }
                }
            }
        }
        return result;
    }
}
