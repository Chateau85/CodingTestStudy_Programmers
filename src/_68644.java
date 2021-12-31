import java.util.Arrays;

public class _68644 {
    public static void main(String[] args) {
        // int[] numbers = {2, 1, 3, 4, 1};
        int[] numbers = {5, 0, 2, 7};
        System.out.println(Arrays.toString(solution(numbers)));
    }

    private static int[] solution(int[] numbers) {
        int[] result;
        int[] range = new int[200];

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (range[numbers[i] + numbers[j]] == 0) {
                    range[numbers[i] + numbers[j]] = 1;
                }
            }
        }

        int size = 0;
        for (int j : range) {
            if (j == 1) {
                size++;
            }
        }

        result = new int[size];
        int resultIndex = 0;
        for (int i = 0; i < range.length; i++) {
            if (range[i] == 1) {
                result[resultIndex++] = i;
            }
        }

        return result;
    }
}
