
import java.util.*;

public class _42579 {
    public static void main(String[] args) {
        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};

        System.out.println(Arrays.toString(solution(genres, plays)));

        String[] genres2 = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays2 = {500, 600, 150, 800, 2500};
        System.out.println(Arrays.toString(solution2(genres2, plays2)));
    }

    private static int[] solution2(String[] genres, int[] plays) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < genres.length; i++) {
            map.put(genres[i], map.getOrDefault(genres[i], 0) + plays[i]);
        }

        // 1. 장르 선정
        List<String> genres_ordered = new ArrayList<>();
        while (map.size() != 0) {
            int max = -1;
            String max_key = "";
            for (String key : map.keySet()) {
                int tmp_cnt = map.get(key);
                if (tmp_cnt > max) {
                    max = tmp_cnt;
                    max_key = key;
                }
            }
            genres_ordered.add(max_key);
            map.remove(max_key);
        }

        // 2. 장르 내 노래 선정
        List<Music> result = new ArrayList<>();
        for (String gern : genres_ordered) {
            List<Music> list = new ArrayList<>();
            for (int i = 0; i < genres.length; i++) {
                if (genres[i].equals(gern)) {
                    list.add(new Music(gern, plays[i], i));
                }
            }
            Collections.sort(list, (o1, o2) -> o2.play - o1.play);
            result.add(list.get(0));
            if (list.size() != 1) {
                result.add(list.get(1));
            }
        }

        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i).idx;
        }
        return answer;
    }

    private static int[] solution(String[] genres, int[] plays) {
        int[] answer = {};

        List<Integer> list = new LinkedList<>();
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < genres.length; i++) {
            map.put(genres[i], map.getOrDefault(genres[i], 0) + plays[i]);
        }

        Set<String> set = map.keySet();
        Map<Integer, String> revMap = new HashMap<>();

        for (String e : set) {
            revMap.put(map.get(e), e);
        }

        TreeMap<Integer, String> tMap = new TreeMap<>(revMap);
        int tMapSize = tMap.size();

        for (int i = 0; i < tMapSize; i++) {
            String genre = tMap.lastEntry().getValue();
            int deleteKey = tMap.lastEntry().getKey();

            int max = -1, nextmax = -1;
            int maxIndex = -1, nextmaxIndex = -1;

            for (int g = 0; g < genres.length; g++) {
                if (genres[g].equals(genre)) {
                    boolean check = max != plays[g];
                    max = Math.max(max, plays[g]);
                    if (plays[g] == max && check) {
                        maxIndex = g;
                    }
                }
            }
            plays[maxIndex] = -1;
            genres[maxIndex] = "-1";
            list.add(maxIndex);

            for (int g = 0; g < genres.length; g++) {
                if (genres[g].equals(genre)) {
                    nextmax = Math.max(nextmax, plays[g]);
                    if (plays[g] == nextmax) {
                        nextmaxIndex = g;
                    }
                }
            }
            if (nextmaxIndex != -1) {
                plays[nextmaxIndex] = -1;
                genres[nextmaxIndex] = "-1";
                list.add(nextmaxIndex);
            }
            tMap.remove(deleteKey);
        }
        answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }

    private static class Music {
        String genre;
        int play;
        int idx;

        public Music(String genre, int play, int idx) {
            this.genre = genre;
            this.play = play;
            this.idx = idx;
        }
    }
}
