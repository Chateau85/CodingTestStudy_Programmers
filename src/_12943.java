public class _12943 {
    public static void main(String[] args) {
        int num = 16;
        System.out.println(solution(num));
    }

    private static int solution(int num) {
        if (num == 1) {
            return 0;
        }

        long proc = num;
        int count = 0;
        while (true) {
            if (proc % 2 == 0) {
                proc /= 2;
            } else {
                proc = proc * 3 + 1;
            }
            count++;

            if (proc == 1) {
                return count;
            }
            if (count == 500) {
                return -1;
            }
        }
    }
}
