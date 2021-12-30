public class _12922 {
    public static void main(String[] args) {
        int n = 4;
        System.out.print(solution(n));
    }

    private static String solution(int n) {
        String start = "수";
        String last = "박";

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                sb.append(start);
            } else {
                sb.append(last);
            }
        }
        return sb.toString();
    }
}
