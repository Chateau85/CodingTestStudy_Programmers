public class _86491 {
    public static void main(String[] args) {
        // int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        // int[][] sizes = {{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}};
        int[][] sizes = {{14, 4}, {19, 6}, {6, 16}, {18, 7}, {7, 11}};
        System.out.println(solution(sizes));
    }

    private static int solution(int[][] sizes) {
        for (int i = 0; i < sizes.length; i++) {
            if (sizes[i][0] < sizes[i][1]) {
                int temp = sizes[i][1];
                sizes[i][1] = sizes[i][0];
                sizes[i][0] = temp;
            }
        }

        int newMaxW = 0;
        int newMaxH = 0;
        for (int[] size : sizes) {
            newMaxW = Math.max(newMaxW, size[0]);
            newMaxH = Math.max(newMaxH, size[1]);
        }
        return newMaxW * newMaxH;
    }
}
