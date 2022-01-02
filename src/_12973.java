import java.util.Stack;

public class _12973 {
    public static void main(String[] args) {
        String s = "baabaa";
        // String s = "cdcd";
        System.out.print(solution(s));
    }

    private static int solution(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (!st.isEmpty() && st.peek() == s.charAt(i)) {
                st.pop();
            } else {
                st.push(s.charAt(i));
            }
        }

        return st.size() == 0 ? 1 : 0;
    }
}
