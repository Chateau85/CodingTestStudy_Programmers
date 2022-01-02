import java.util.Arrays;
import java.util.Comparator;

public class _42746 {
    public static void main(String[] args) {
        // int[] numbers = {3, 30, 34, 5, 9};
        int[] numbers = {6, 10, 2};
        System.out.print(solution(numbers));
    }

    private static String solution(int[] numbers) {
        StringBuilder sb = new StringBuilder();
        for (int i : numbers) {
            sb.append(i);
        }
        int size = sb.length();
        sb.setLength(0);
        int[][] comp = new int[numbers.length][2];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < size; j++) {
                if (sb.length() >= size) {
                    break;
                }
                sb.append(numbers[i]);
            }
            comp[i][0] = Integer.parseInt(sb.substring(0, size));
            comp[i][1] = numbers[i];
            sb.setLength(0);
        }

        Arrays.sort(comp, (o1, o2) -> Integer.compare(o2[0], o1[0]));

        for (int[] ints : comp) {
            sb.append(ints[1]);
        }
        return sb.toString();
    }
}
