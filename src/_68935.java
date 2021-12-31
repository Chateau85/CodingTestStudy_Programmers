public class _68935 {
    public static void main(String[] args) {
        int n = 100000000;
        System.out.println(solution(n));
    }

    private static int solution(int n) {
        String t = Integer.toString(n, 3);

        int result = 0;
        for (int i = 0; i < t.length(); i++) {
            result += (t.charAt(i) - '0') * Math.pow(3, i);
        }

        return result;
    }
}
