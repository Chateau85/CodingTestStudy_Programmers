public class _12913 {
    public static void main(String[] args) {
        int[][] land = {{1, 2, 3, 5}, {5, 6, 7, 8}, {4, 3, 2, 1}};
        System.out.print(solution(land));
    }

    private static int solution(int[][] land) {
        int result = 0;

        int colMaxIndex = -1;
        int prevColMaxIndex = -1;
        for (int[] ints : land) {
            int colMax = 0;
            for (int j = 0; j < 4; j++) {
                if (j == prevColMaxIndex) {
                    continue;
                }
                if (colMax < ints[j]) {
                    colMax = ints[j];
                    colMaxIndex = j;
                }
            }
            result += colMax;
            prevColMaxIndex = colMaxIndex;
        }
        return result;
    }
}
