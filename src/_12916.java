public class _12916 {
    public static void main(String[] args) {
        String s = "Pyy";
        System.out.println(solution(s));
    }

    private static boolean solution(String s) {
        if (s.toLowerCase().contains("p") && s.toLowerCase().contains("y")) {
            int count = 0;
            for (char c : s.toCharArray()) {
                if (c == 'p' || c == 'P') {
                    count++;
                } else if (c == 'y' || c == 'Y') {
                    count--;
                }
            }
            return count == 0;
        } else {
            return true;
        }
    }
}
