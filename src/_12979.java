public class _12979 {
    public static void main(String[] args) {
        int n = 11;
        int[] stations = {4, 11};
        int w = 1;
        System.out.println(solution(n, stations, w));
    }

    private static int solution(int n, int[] stations, int w) {
        int answer = 0;

        int index = 0;
        int position = 1;
        while (position <= n) {
            if (index < stations.length && position >= stations[index] - w) {
                position = stations[index++] + w + 1;
            } else {
                position += (w * 2) + 1;
                answer++;
            }
        }

        return answer;
    }
}
