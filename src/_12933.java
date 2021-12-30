import java.util.Arrays;

public class _12933 {
    public static void main(String[] args) {
        long n = 123456789L;
        System.out.println(solution(n));
    }

    private static long solution(long n) {
        char[] c = String.valueOf(n).toCharArray();
        Arrays.sort(c);
        int l = 0, r = c.length - 1;
        while (l < r) {
            char temp = c[l];
            c[l] = c[r];
            c[r] = temp;
            l++;
            r--;

        }
        return Long.parseLong(String.valueOf(c));
    }
}
