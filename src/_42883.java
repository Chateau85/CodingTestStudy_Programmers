import java.util.Arrays;

public class _42883 {
    public static void main(String[] args) {
        // String number = "4177252841";        int k = 4;
        // String number = "1231234";         int k = 3;
        String number = "1924";
        int k = 2;
        // String number = "9998";        int k = 2;
        System.out.print(solution(number, k));
    }

    private static String solution(String number, int k) {
        StringBuilder sb = new StringBuilder();

        int maxIndex = -1;
        for (int i = 0; i < number.length() - k; i++) {
            char max = 0;
            for (int j = maxIndex + 1; j <= k + i; j++) {
                if (max < number.charAt(j)) {
                    max = number.charAt(j);
                    maxIndex = j;
                }
            }
            sb.append(max);
        }

        return sb.toString();
    }
}
