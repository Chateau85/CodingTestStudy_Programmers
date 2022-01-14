import java.util.*;

public class _42888 {
    public static void main(String[] args) {
        String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo", "Change uid4567 Ryan"};
        System.out.println(Arrays.toString(solution(record)));
        System.out.println(Arrays.toString(solution2(record)));
    }

    private static String[] solution2(String[] record) {
        HashMap<String, String> codeMap = new HashMap<String, String>();
        codeMap.put("enter", "들어왔습니다.");
        codeMap.put("leave", "나갔습니다.");

        HashMap<String, String> uidMap = new HashMap<String, String>();
        List<String> list = new ArrayList<String>();
        for (String str : record) {
            String[] split = str.split("\\s+");
            String code = split[0];
            String uid = split[1];
            if (split.length > 2) {
                String name = split[2];
                uidMap.put(uid, name);
            }
            if (!"Change".equalsIgnoreCase(code)) {
                list.add(code + " " + uid);
            }

        }
        String[] answer = new String[list.size()];
        for (int i = 0; i < answer.length; i++) {
            String[] split = list.get(i).split("\\s+");
            String name = uidMap.get(split[1]);
            answer[i] = name + "님이 " + codeMap.get(split[0].toLowerCase());
        }

        return answer;
    }

    private static String[] solution(String[] record) {
        String[] acts = {"Enter", "Leave", "Change"};

        Map<String, String> map = new TreeMap<>();
        int enterLeaveCount = 0;
        for (String s : record) {
            String[] words = s.split(" ");
            String act = words[0];
            String uid = words[1];

            if (act.equals(acts[0])) {
                String nickname = words[2];
                map.put(uid, nickname);
                enterLeaveCount++;
            } else if (act.equals(acts[1])) {
                enterLeaveCount++;
            } else {
                String nickname = words[2];
                map.put(uid, nickname);
            }
        }

        String[] answer = new String[enterLeaveCount];
        enterLeaveCount = 0;
        for (String s : record) {
            String[] words = s.split(" ");
            String act = words[0];
            String uid = words[1];
            if (act.equals(acts[0])) {
                String nickname = map.get(uid);
                answer[enterLeaveCount++] = String.format("%s님이 들어왔습니다.", nickname);
            } else if (act.equals(acts[1])) {
                String nickname = map.get(uid);
                answer[enterLeaveCount++] = String.format("%s님이 나갔습니다.", nickname);
            }
        }

        return answer;
    }
}
