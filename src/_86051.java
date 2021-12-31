public class _86051 {
    public static void main(String[] args) {
        // int[] numbers = {1, 2, 3, 4, 6, 7, 8, 0};
        int[] numbers = {5, 8, 4, 0, 6, 7, 9};
        System.out.println(solution(numbers));
    }

    private static int solution(int[] numbers) {
        int answer = 0;
        for (int number : numbers) {
            answer += number;
        }
        return 45 - answer;
    }
}
