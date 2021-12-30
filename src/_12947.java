public class _12947 {
    public static void main(String[] args) {
        int x = 9999;
        System.out.println(solution(x));
    }

    private static boolean solution(int x) {
        int sum = 0;
        int prev = x;
        while (x > 0) {
            sum += x % 10;
            x = x / 10;
        }
        return prev % sum == 0;
    }
}
