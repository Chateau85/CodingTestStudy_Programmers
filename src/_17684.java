import java.util.*;

public class _17684 {
    public static void main(String[] args) {
        String msg = "KAKAO";
        System.out.println(Arrays.toString(solution(msg)));
    }

    private static int[] solution(String msg) {
        List<Integer> list = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < 26; i++) {
            map.put(Character.toString((char) ('A' + i)), i + 1);
        }
        int index = 27;
        int l = msg.length();
        for (int i = 0; i < l; i++) {
            int inner = 1;
            while (i + inner <= l && map.containsKey(msg.substring(i, i + inner))) {
                inner++;
            }
            if (i + inner > l) {
                list.add(map.get(msg.substring(i)));
                break;
            }
            list.add(map.get(msg.substring(i, i + inner - 1)));
            map.put(msg.substring(i, i + inner), index++);
            if (inner > 1) {
                i += inner - 2;
            }
        }

        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}
