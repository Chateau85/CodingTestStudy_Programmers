public class _321 {
    public static void main(String[] args) {
//        String p = "82195";
//        String s = "64723";
        String p = "1";
        String s = "1";
        System.out.println(solution(p, s));
    }

    private static int solution(String p, String s) {
        int answer = 0;

        char[] pArr = p.toCharArray();
        char[] sArr = s.toCharArray();
        for (int i = 0; i < pArr.length; i++) {
            char cp = pArr[i];
            char cs = sArr[i];
            int gap = Math.abs((cp - '0') - (cs - '0'));
            int result = gap < 5 ? gap : 10 - gap;
            answer += result;
        }

        return answer;
    }
}
