public class _12930 {
    public static void main(String[] args) {
        String s = "try hello world";
        System.out.print(solution(s));
    }

    private static String solution(String s) {
        int index = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ') {
                index = 0;
            } else {
                if (index % 2 == 0) {
                    chars[i] = Character.toUpperCase(chars[i]);
                }
                index++;
            }
        }
        return String.valueOf(chars);
    }
}
