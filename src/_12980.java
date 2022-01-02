public class _12980 {
    public static void main(String[] args) {
        int n = 5000;
        System.out.println(solution(n));
    }

    private static int solution(int n) {
        int result = 0;
        while (n != 0) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n--;
                result++;
            }
        }
        return result;
    }
}
