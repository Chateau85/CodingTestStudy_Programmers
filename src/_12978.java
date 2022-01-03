import java.util.*;

public class _12978 {
    static List<City>[] cityList;
    static int[] distances;

    public static void main(String[] args) {
        int n = 5;
        int[][] road = {{1, 2, 1}, {2, 3, 3}, {5, 2, 2}, {1, 4, 2}, {5, 3, 1}, {5, 4, 2}};
        int k = 3;
        System.out.print(solution(n, road, k));
    }

    private static int solution(int n, int[][] road, int k) {
        int result = 0;
        cityList = new ArrayList[n + 1];
        distances = new int[n + 1];
        Arrays.fill(distances, Integer.MAX_VALUE);

        for (int i = 1; i <= n; i++) {
            cityList[i] = new ArrayList<>();
        }
        for (int[] val : road) {
            cityList[val[0]].add(new City(val[1], val[2]));
            cityList[val[1]].add(new City(val[0], val[2]));
        }
        distances[1] = 0;
        dijkstra();
        for (int cost : distances) {
            if (cost <= k) {
                result++;
            }
        }
        return result;
    }

    private static void dijkstra() {
        Queue<City> q = new ArrayDeque<>();
        q.add(new City(1, 0));
        while (!q.isEmpty()) {
            City c = q.poll();
            int v = c.v;
            int w = c.w;
            if (distances[v] < w) {
                continue;
            }
            for (int i = 0; i < cityList[v].size(); i++) {
                int v2 = cityList[v].get(i).v;
                int w2 = cityList[v].get(i).w + w;
                if (distances[v2] > w2) {
                    distances[v2] = w2;
                    q.add(new City(v2, w2));
                }
            }
        }
    }

    static class City {
        int v, w;

        public City(int v, int w) {
            this.v = v;
            this.w = w;
        }
    }
}
