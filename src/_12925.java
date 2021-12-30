public class _12925 {
    public static void main(String[] args) {
        String s = "-1234";
        System.out.println(solution(s));
    }

    private static int solution(String s) {
        int result = 0;
        char[] chars = s.toCharArray();
        int index = 0;
        if (chars[0] == '-' || chars[0] == '+') {
            index++;
        }
        int size = chars.length - index - 1;
        while (index < chars.length) {
            result += (chars[index] - 48) * Math.pow(10, size--);
            index++;
        }
        return chars[0] == '-' ? result * -1 : result;
    }
}
