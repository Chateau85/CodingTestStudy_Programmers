public class _12926 {
    public static void main(String[] args) {
        String s = "AB";
        int n = 1;
        System.out.print(solution(s, n));
    }

    private static String solution(String s, int n) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if ('A' <= chars[i] && chars[i] <= 'Z') {
                chars[i] = (char) ((chars[i] - 'A' + n) % 26 + 'A');
            } else if ('a' <= chars[i] && chars[i] <= 'z') {
                chars[i] = (char) ((chars[i] - 'a' + n) % 26 + 'a');
            }
        }
        return String.valueOf(chars);
    }
}
