import java.util.Arrays;

public class _42584 {
    public static void main(String[] args) {
        int[] prices = {1, 2, 3, 2, 3};
        System.out.println(Arrays.toString(solution(prices)));
    }

    private static int[] solution(int[] prices) {
        int[] result = new int[prices.length];
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[i] > prices[j]) {
                    result[i] = j - i;
                    break;
                }
                if (j == result.length - 1) {
                    result[i] = j - i;
                }
            }
        }
        return result;
    }
}
