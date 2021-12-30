public class _12944 {
    public static void main(String[] args) {
        // int[] arr = {1, 2, 3, 4};
        int[] arr = {5, 5};
        System.out.println(solution(arr));
    }

    private static double solution(int[] arr) {
        double sum = 0.0;
        for (int j : arr) {
            sum += j;
        }
        return sum / arr.length;
    }
}
