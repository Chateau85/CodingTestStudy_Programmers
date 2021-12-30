public class _12901 {
    public static void main(String[] args) {
        int a = 9, b = 29;
        System.out.print(solution(a, b));
    }

    private static String solution(int a, int b) {
        String[] day = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int[] monthDay = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int total = 0;
        for (int i = 0; i < a - 1; i++) {
            total += monthDay[i];
        }
        total += b - 1;
        return day[total % 7];
    }
}
