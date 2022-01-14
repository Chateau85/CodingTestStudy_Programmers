public class _43165 {
    static int answer;

    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 7, 9};
        int target = 5;
        System.out.println(solution(numbers, target));
    }

    private static int solution(int[] numbers, int target) {
        answer = 0;
        dfs(numbers, target, 0, 0);
        return answer;
    }

    private static void dfs(int[] numbers, int target, int depth, int calc) {
        if (depth == numbers.length) {
            if (target == calc) {
                answer++;
            }
            return;
        }
        dfs(numbers, target, depth + 1, calc + numbers[depth]);
        dfs(numbers, target, depth + 1, calc - numbers[depth]);
    }
}
