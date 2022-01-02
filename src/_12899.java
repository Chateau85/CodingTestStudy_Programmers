public class _12899 {
    public static void main(String[] args) {
        int n = 124;
        System.out.println(solution(n));
    }

    private static String solution(int n) {
        String[] arr = {"4", "1", "2"};
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            int r = n % 3;
            n /= 3;
            if (r == 0) {
                n--;
            }
            sb.insert(0, (arr[r]));
        }
        return sb.toString();
    }
}
