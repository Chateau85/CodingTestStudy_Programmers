import java.util.Arrays;

public class _12940 {
    public static void main(String[] args) {
        int n = 999999, m = 10000000;
        System.out.println(Arrays.toString(solution(n, m)));
    }

    private static int[] solution(int n, int m) {
        int[] result = new int[2];
        result[0] = gcd(n, m);
        result[1] = lcm(n, m, result[0]);
        return result;
    }

    private static int gcd(int n, int m) {
        if (m == 0) return n;
        return gcd(m, n % m);
    }

    private static int lcm(int n, int m, int gcd) {
        return (n * m) / gcd;
    }

}
