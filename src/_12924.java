public class _12924 {
    public static void main(String[] args) {
        int n = 15;
        System.out.println(solution(n));
    }

    private static int solution(int n) {
        int count = 0;
//        for (int i = 1; i <= n / 2; i++) {
//            int tmp = 0;
//            for (int j = i; j < n + 1; j++) {
//                tmp += j;
//                if (tmp == n) {
//                    count++;
//                } else if (tmp > n) {
//                    break;
//                }
//            }
//        }

        for (int i = 1; i <= n; i++) {
            if (n % i == 0 && i % 2 == 1) {
                count++;
            }
        }
        return count + 1;
    }
}
