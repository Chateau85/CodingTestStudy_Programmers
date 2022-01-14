import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class _17686 {
    public static void main(String[] args) {
        String[] files = {"F-5 Freedom Fighter", "B-50 Superfortress", "A-10 Thunderbolt II", "F-14 Tomcat"};
        System.out.println(Arrays.toString(solution(files)));
    }

    private static String[] solution(String[] files) {
        String[] answer = {};
        Arrays.sort(files, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                String s1Head = s1.split("[0-9]")[0];
                String s2Head = s2.split("[0-9]")[0];

                int sortValue = s1Head.toLowerCase().compareTo(s2Head.toLowerCase());
                if (sortValue == 0) {
                    sortValue = convertNum(s1, s1Head) - convertNum(s2, s2Head);
                }
                return sortValue;
            }
        });
        answer = files;
        return answer;
    }

    public static int convertNum(String str, String head) {
        str = str.substring(head.length()); // head 길이만큼 잘라서 숫자부터 시작하게 만들어줌
        String result = "";
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c) && result.length() < 5) // 숫자인지 그리고 result 길이가 5가 안 넘는지 확인
                result += c;
            else
                break;
        }
        return Integer.parseInt(result);
    }

    @Test
    public void 정답() {
        Assert.assertEquals(new String[]{"img1.png", "IMG01.GIF", "img02.png", "img2.JPG", "img10.png", "img12.png"}, solution(new String[]{"img12.png", "img10.png", "img02.png", "img1.png", "IMG01.GIF", "img2.JPG"}));
        Assert.assertEquals(new String[]{"A-10 Thunderbolt II", "B-50 Superfortress", "F-5 Freedom Fighter", "F-14 Tomcat"}, solution(new String[]{"F-5 Freedom Fighter", "B-50 Superfortress", "A-10 Thunderbolt II", "F-14 Tomcat"}));
    }
}
