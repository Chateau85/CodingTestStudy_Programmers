public class _12909 {
    public static void main(String[] args) {
        // String s = "(())()";
        // String s = ")()(";
        // String s = "(()(";
        String s = "()()";
        System.out.print(solution(s));
    }

    private static boolean solution(String s) {
        int comp = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                comp++;
            } else {
                comp--;
            }

            if (comp < 0) {
                return false;
            }
        }
        return comp == 0;
    }
}
