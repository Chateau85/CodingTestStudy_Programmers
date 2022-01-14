import java.util.ArrayDeque;
import java.util.Deque;

public class _42583 {
    public static void main(String[] args) {
        int bridge_length = 2;
        int weight = 10;
        int[] truck_weights = {7, 4, 5, 6};
        System.out.println(solution(bridge_length, weight, truck_weights));
    }

    private static int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;

        Deque<Integer> bridge = new ArrayDeque<>();
        Deque<Integer> trucks = new ArrayDeque<>();

        for (int i = 0; i < bridge_length; i++) {
            bridge.push(0);
        }

        for (int i : truck_weights) {
            trucks.push(i);
        }

        int weightSum = 0;
        while (!bridge.isEmpty()) {
            weightSum -= bridge.peek();
            bridge.poll();

            if (trucks.isEmpty()) {
                answer += bridge_length;
                break;
            } else {
                if (weightSum + trucks.peek() <= weight) {
                    bridge.offer(trucks.peek());
                    weightSum += trucks.peek();
                    trucks.poll();
                } else {
                    bridge.offer(0);
                }
            }
            answer++;
        }


        return answer;
    }
}
