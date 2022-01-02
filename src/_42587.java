import java.util.Collections;
import java.util.PriorityQueue;

public class _42587 {
    public static void main(String[] args) {
        // int[] priorities = {2, 1, 3, 2};         int location = 2;
        int[] priorities = {1, 1, 9, 1, 1, 1};
        int location = 0;
        System.out.print(solution(priorities, location));
    }

    private static int solution(int[] priorities, int location) {
        int result = 1;

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int e : priorities) {
            pq.add(e);
        }

        while (!pq.isEmpty()) {
            for (int i = 0; i < priorities.length; i++) {
                if (!pq.isEmpty() && priorities[i] == pq.peek()) {
                    if (i == location) {
                        return result;
                    } else {
                        pq.poll();
                        result++;
                    }
                }
            }
        }
        return result;
    }
}
