public class _12918 {
    public static void main(String[] args) {
        String s = "1234";
        System.out.print(solution(s));
    }

    private static boolean solution(String s) {
        if (s.length() < 1 || s.length() > 9) {
            return false;
        }

        if (s.length() == 4 || s.length() == 6) {
            for (int i = 0; i < s.length(); i++) {
                if (!('0' <= s.charAt(i) && s.charAt(i) <= '9')) {
                    return false;
                }
            }
        } else {
            return false;
        }

        return true;
    }
}
