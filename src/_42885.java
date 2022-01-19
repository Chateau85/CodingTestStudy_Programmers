import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class _42885 {
    public static void main(String[] args) {
        int[] people = {70, 50, 80, 50};
        int limit = 100;
        System.out.println(solution(people, limit));
    }

    private static int solution(int[] people, int limit) {
        int answer = 0;

        Arrays.sort(people);
        Deque<Integer> dq = new ArrayDeque<>();
        for (int i : people) {
            dq.offer(i);
        }

        while (!dq.isEmpty()) {
            int total = dq.pollLast();
            if (!dq.isEmpty() && total + dq.peekFirst() <= limit) {
                dq.pollFirst();
            }
            answer++;
        }

        return answer;
    }
}
