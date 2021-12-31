public class _81301 {
    public static void main(String[] args) {
        // String s = "one4seveneight";
        // String s = "23four5six7";
        // String s = "2three45sixseven";
        String s = "123";
        System.out.println(solution(s));
    }

    private static int solution(String s) {
        StringBuilder sb = new StringBuilder();
        StringBuilder inner = new StringBuilder();
        String[] matches = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for (int i = 0; i < s.length(); i++) {
            if ('0' <= s.charAt(i) && s.charAt(i) <= '9') {
                sb.append(s.charAt(i));
            } else {
                inner.append(s.charAt(i));
                if (inner.length() < 3) continue;
                for (int j = 0; j < matches.length; j++) {
                    if (matches[j].equals(inner.toString())) {
                        sb.append(j);
                        inner.setLength(0);
                        break;
                    }
                }
            }
        }

        return Integer.parseInt(sb.toString());
    }
}
