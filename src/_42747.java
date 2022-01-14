import java.util.Arrays;

public class _42747 {
    public static void main(String[] args) {
        int[] citations = {3, 0, 6, 1, 5};
        //int[] citations = {25, 8, 5, 3};
        // int[] citations = {9, 7, 6, 2};
        // int[] citations = {10, 8, 5, 4};
        System.out.println(solution(citations));
    }

    private static int solution(int[] citations) {
        int answer = 0;

        Arrays.sort(citations);
        int len = citations.length;

        int hIndex = 0;
        for (int i = 0; i < len; i++) {
            hIndex = len - i;
            if (citations[i] >= hIndex) {
                answer = hIndex;
                break;
            }
        }

        return answer;
    }
}
