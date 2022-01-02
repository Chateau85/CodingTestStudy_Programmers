public class _12953 {
    public static void main(String[] args) {
        int[] arr = {2, 6, 8, 14};
        System.out.println(solution(arr));
    }

    private static int solution(int[] arr) {
        int result = arr[0];
        for (int i : arr) {
            result = getLCM(result, i);
        }
        return result;
    }

    private static int getLCM(int result, int i) {
        return (result * i) / getGCD(result, i);
    }

    private static int getGCD(int result, int i) {
        if (i == 0) return result;
        return getGCD(i, result % i);
    }
}
