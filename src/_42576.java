import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class _42576 {
    public static void main(String[] args) {
        String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion = {"josipa", "filipa", "marina", "nikola"};
        // String[] participant = {"mislav", "stanko", "mislav", "ana"};
        // String[] completion = {"stanko", "ana", "mislav"};
        System.out.println(solution(participant, completion));
    }

    private static String solution(String[] participant, String[] completion) {
        String result = "";
        Map<String, Integer> map = new HashMap<>();
        for (String part : participant) {
            map.put(part, map.getOrDefault(part, 0) + 1);
        }

        for (String comp : completion) {
            map.put(comp, map.get(comp) - 1);
        }

        for (String not : map.keySet()) {
            if (map.get(not) == 1) {
                result = not;
            }
        }
        return result;
    }
}
