import java.util.Arrays;

public class _17681 {
    public static void main(String[] args) {
        int n = 5;
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};
        System.out.println(Arrays.toString(solution(n, arr1, arr2)));
    }

    private static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] sArr1 = new String[n];
        String[] sArr2 = new String[n];
        String[] result = new String[n];

        for (int i = 0; i < n; i++) {
            sArr1[i] = getStringBuilder(arr1[i]);
            sArr2[i] = getStringBuilder(arr2[i]);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sb.append(sArr1[i].charAt(j) == sArr2[i].charAt(j) ? sArr1[i].charAt(j) == '0' ? " " : "#" : "#");
            }
            result[i] = sb.toString();
            sb.setLength(0);
        }
        return result;
    }

    private static String getStringBuilder(int i) {
        StringBuilder value = new StringBuilder(Integer.toBinaryString(i));
        while (value.length() < 5) {
            value.insert(0, '0');
        }
        return value.toString();
    }
}
