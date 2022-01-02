import java.util.HashSet;
import java.util.Set;

public class _42839 {
    public static void main(String[] args) {
        // String numbers = "17";
        String numbers = "011";
        System.out.println(solution(numbers));
    }

    private static int solution(String numbers) {
        int result = 0;
        boolean[] visited = new boolean[numbers.length()];
        Set<Integer> set = new HashSet<>();

        permutation(numbers, visited, 0, new StringBuilder(), set);

        for (Integer n : set) {
            if (n < 2) continue;
            boolean prime = true;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                result++;
            }
        }

        return result;
    }

    private static void permutation(String numbers, boolean[] visited, int length, StringBuilder sb, Set<Integer> set) {
        for (int i = 0; i < visited.length; i++) {
            if (visited[i]) continue;

            visited[i] = true;
            sb.append(numbers.charAt(i));

            set.add(Integer.parseInt(sb.toString()));
            permutation(numbers, visited, length + 1, sb, set);

            sb.deleteCharAt(sb.length() - 1);
            visited[i] = false;
        }
    }
}
