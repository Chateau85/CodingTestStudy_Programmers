public class _12948 {
    public static void main(String[] args) {
        // String phone_number = "01033334444";
        String phone_number = "027778888";
        System.out.println(solution(phone_number));
    }

    private static String solution(String phone_number) {
        char[] arr = phone_number.toCharArray();
        for (int i = phone_number.length() - 5; i >= 0; i--) {
            arr[i] = '*';
        }
        return String.valueOf(arr);
    }
}
