public class _12921 {
    public static void main(String[] args) {
        int n = 1000000;
        System.out.print(solution(n));
    }

    private static int solution(int n) {
        int[] numbers = new int[n + 1];
        int count = 0;
        for (int i = 2; i <= n; i++) {
            numbers[i] = i;
        }
        for (int i = 2; i <= n; i++) {
            if (numbers[i] == 0) continue;
            for (int j = 2 * i; j <= n; j += i) {
                numbers[j] = 0;
            }
        }

        for (int number : numbers) {
            if (number != 0) {
                count++;
            }
        }
        return count;
    }
}
