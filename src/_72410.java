import java.util.Arrays;

public class _72410 {
    public static void main(String[] args) {
        // String new_id = "...!@BaT#*..y.abcdefghijklm";
        // String new_id = "z-+.^.";
        // String new_id = "=.=";
        // String new_id = "123_.def";
        String new_id = "abcdefghijklmn.p";
        System.out.print(solution(new_id));
    }

    private static String solution(String new_id) {

        char[] arr = new_id.toCharArray();
        phase1(arr);
        arr = phase2(arr);
        arr = phase3(arr);
        arr = phase4(arr);
        arr = phase5(arr);
        arr = phase6(arr);
        arr = phase7(arr);

        return String.valueOf(arr);
    }

    private static char[] phase7(char[] arr) {
        if (arr.length <= 2) {
            StringBuilder sb = new StringBuilder(String.valueOf(arr));
            while (sb.length() < 3) {
                sb.append(sb.charAt(sb.length() - 1));
            }
            return sb.toString().toCharArray();
        }
        return arr;
    }

    private static char[] phase6(char[] arr) {
        if (arr.length >= 16) {
            arr = Arrays.copyOf(arr, 15);
        }
        if (arr[arr.length - 1] == '.') {
            arr = Arrays.copyOf(arr, arr.length - 1);
        }
        return arr;
    }

    private static char[] phase5(char[] arr) {
        if (arr.length == 0) {
            return new char[]{'a'};
        }
        return arr;
    }

    private static char[] phase4(char[] arr) {
        StringBuilder sb = new StringBuilder(String.valueOf(arr));
        if (arr[0] == '.') {
            sb.replace(0, 1, "");
        }
        if (sb.length() >= 1 && arr[arr.length - 1] == '.') {
            sb.deleteCharAt(sb.length() - 1);
        }

        return sb.toString().toCharArray();
    }

    private static char[] phase3(char[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != '.' || arr[i - 1] != '.') {
                sb.append(arr[i]);
            }
        }
        return sb.toString().toCharArray();
    }

    private static char[] phase2(char[] arr) {
        StringBuilder sb = new StringBuilder();
        for (char c : arr) {
            if (Character.isAlphabetic(c) || Character.isDigit(c) || c == '-' || c == '_' || c == '.') {
                sb.append(c);
            }
        }
        return sb.toString().toCharArray();
    }

    private static char[] phase1(char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (Character.isUpperCase(arr[i])) {
                arr[i] = Character.toLowerCase(arr[i]);
            }
        }
        return arr;
    }
}