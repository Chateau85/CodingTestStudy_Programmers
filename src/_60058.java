public class _60058 {
    static int index = 0;

    public static void main(String[] args) {
        String p = ")(";
        System.out.println(solution(p));
    }

    private static String solution(String p) {
        StringBuilder sb = new StringBuilder();
        if (p.length() == 0) {
            return sb.toString();
        }

        int count = 0;
        int index = 0;
        for (int i = 0; i < p.length(); i++) {
            if (p.charAt(i) == '(') {
                count++;
            } else {
                count--;
            }

            if (count == 0) {
                index = i;
                break;
            }
        }
        String u = p.substring(0, index + 1);
        String v = p.substring(index + 1);

        if (verify(u)) {
            sb.append(u);
            sb.append(solution(v));
        } else {
            sb.append("(");
            sb.append(solution(v));
            sb.append(")");
            for (int i = 1; i < u.length() - 1; i++) {
                if (u.charAt(i) == '(') {
                    sb.append(")");
                }
                if (u.charAt(i) == ')') {
                    sb.append("(");
                }
            }
        }
        return sb.toString();
    }

    private static boolean verify(String p) {
        String[] split = p.split("");
        int count = 0;
        for (String s : split) {
            if (s.equals("(")) count++;
            else count--;

            if (count < 0) return false;
        }
        return true;
    }
}
