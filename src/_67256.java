public class _67256 {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String hand = "right";
        System.out.println(solution(numbers, hand));
    }

    private static String solution(int[] numbers, String hand) {
        int[][] dialLoc = {{4, 2}, {1, 1}, {1, 2}, {1, 3}, {2, 1}, {2, 2}, {2, 3}, {3, 1}, {3, 2}, {3, 3}};
        StringBuilder sb = new StringBuilder();
        int[] l = {4, 1};
        int[] r = {4, 3};
        for (int c : numbers) {
            switch (c) {
                case 1:
                case 4:
                case 7:
                    l = dialLoc[c];
                    sb.append("L");
                    break;
                case 3:
                case 6:
                case 9:
                    r = dialLoc[c];
                    sb.append("R");
                    break;
            }
            if (c == 2 || c == 5 || c == 8 || c == 0) {
                int lMove = Math.abs(l[0] - dialLoc[c][0]) + Math.abs(l[1] - dialLoc[c][1]);
                int rMove = Math.abs(r[0] - dialLoc[c][0]) + Math.abs(r[1] - dialLoc[c][1]);
                if (lMove > rMove) {
                    r = dialLoc[c];
                    sb.append("R");
                } else if (lMove < rMove) {
                    l = dialLoc[c];
                    sb.append("L");
                } else {
                    if (hand.equals("right")) {
                        r = dialLoc[c];
                        sb.append("R");
                    } else {
                        l = dialLoc[c];
                        sb.append("L");
                    }
                }
            }
        }

        return sb.toString();
    }
}
