import java.util.Arrays;
import java.util.Comparator;

public class _12917 {
    public static void main(String[] args) {
        String s = "ZGASDASbcdefg";
        System.out.println(solution(s));
    }

    private static String solution(String s) {
        String[] str = s.split("");
        Arrays.sort(str, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });

        StringBuilder sb = new StringBuilder();
        for (String word : str) {
            sb.append(word);
        }

        return sb.toString();
    }
}
