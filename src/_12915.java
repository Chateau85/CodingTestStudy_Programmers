import java.util.Arrays;
import java.util.Comparator;

public class _12915 {
    public static void main(String[] args) {
        //String[] strings = {"sun", "bed", "car"};         int n = 1;
        String[] strings = {"abce", "abcd", "cdx"};
        int n = 2;
        System.out.print(Arrays.toString(solution(strings, n)));
    }

    private static String[] solution(String[] strings, int n) {
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Character.compare(o1.charAt(n), o2.charAt(n));
            }
        });
        return strings;
    }
}
