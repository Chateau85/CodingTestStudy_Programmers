import java.util.Collections;
import java.util.PriorityQueue;

public class _12927 {
    public static void main(String[] args) {
        int[] works = {4, 3, 3};
        int n = 4;
        System.out.println(solution(n, works));
    }

    private static long solution(int n, int[] works) {
        long answer = 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int work : works) {
            pq.offer(work);
        }

        for (int i = 0; i < n; i++) {
            int max = pq.poll();
            if (max <= 0) {
                break;
            }
            pq.offer(max - 1);
        }
        while (!pq.isEmpty()) {
            answer += Math.pow(pq.poll(), 2);
        }

        return answer;
    }
}
