public class _62048 {
    public static void main(String[] args) {
        int w = 8, h = 12;
        // int w = 3, h = 3;
        System.out.println(solution(w, h));
    }

    private static long solution(int w, int h) {
        long answer = 1;
        answer = ((long) w * h) - (w + h - gcd(w, h));
        return answer;
    }

    private static int gcd(int w, int h) {
        if (h == 0) return w;
        return gcd(h, w % h);
    }

}
