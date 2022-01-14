import java.util.PriorityQueue;

public class _42626 {
    public static void main(String[] args) {
        int[] scoville = {1, 2, 3};
        int K = 11;
        System.out.println(solution(scoville, K));
    }

    private static int solution(int[] scoville, int K) {
        int answer = 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i : scoville) {
            pq.offer(i);
        }

        while (!pq.isEmpty() && pq.peek() < K) {
            if (pq.size() == 1) {
                return -1;
            }
            int firstMin = pq.poll();
            int secondMin = pq.poll();

            int newScoville = firstMin + (secondMin * 2);
            pq.offer(newScoville);
            answer++;
        }

        return answer;
    }
}
