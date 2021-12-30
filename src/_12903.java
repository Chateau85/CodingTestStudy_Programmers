public class _12903 {
    public static void main(String[] args) {
        // String s = "abcde";
        String s = "qwer";
        System.out.println(solution(s));
    }

    private static String solution(String s) {
        return s.length() % 2 == 0 ? s.substring(s.length() / 2 - 1, s.length() / 2 + 1) : s.substring(s.length() / 2, s.length() / 2 + 1);
    }
}
