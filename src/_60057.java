public class _60057 {
    public static void main(String[] args) {
        String s = "ababcdcdababcdcd";
        System.out.println(solution(s));
        System.out.println(solution2(s));
    }

    private static int solution2(String s) {
        int answer = 1000;
        if (s.length() < 2) {
            return s.length();
        }
        for (int i = 1; i < s.length() / 2 + 2; i++) {
            String subStr = s.substring(0, i); // subStr 사이즈 : 압축사이즈
            String output = "";
            int count = 1;
            int lastIndex = 0;
            for (int j = i; j + i <= s.length(); j += i) {
                String strToCompare = s.substring(j, j + i); // 비교 대상 String
                if (subStr.equals(strToCompare)) { // 텍스트가 연속되어 압축 가능한 경우
                    count++;
                } else { // 연속되지 않는 경우
                    if (count > 1) {
                        output += count;
                        count = 1;
                    }
                    output += subStr;
                    subStr = strToCompare;
                }
                lastIndex = j + i;
            }
            // 마지막 round에서 기록된 값 업데이트
            if (count > 1) {
                output += count;
            }
            output += subStr;
            // String을 끝까지 확인하지 않고 끝난 경우
            if (lastIndex < s.length()) {
                output += s.substring(lastIndex);
            }
            // 더 짧은 output 길이로 업데이트
            answer = Math.min(answer, output.length());
        }
        return answer;
    }


    private static int solution(String s) {
        if (s.length() < 2) {
            return 1;
        }
        int len = s.length();
        int answer = 1001;
        char[] arr = s.toCharArray();
        for (int i = 1; i <= len / 2; i++) {
            int idx = 0;
            int cnt = 0;
            StringBuilder split = new StringBuilder();
            String str = "";

            while (idx + i <= len) {
                if (String.valueOf(arr, idx, i).equals(str)) {
                    cnt++;
                } else {
                    if (cnt > 1) {
                        split.append(cnt);
                    }
                    split.append(str);
                    str = String.valueOf(arr, idx, i);
                    cnt = 1;
                }
                idx += i;
            }
            if (cnt > 1) {
                split.append(cnt);
            }
            split.append(str);

            if (idx < len) {
                split.append(String.valueOf(arr, idx, arr.length - idx));
            }
            answer = Math.min(answer, split.length());
        }
        return answer;
    }
}
