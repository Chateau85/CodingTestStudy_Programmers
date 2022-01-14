import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class _17687 {
    public static void main(String[] args) {
        int n = 16;
        int t = 16;
        int m = 2;
        int p = 1;
        // "13579BDF01234567"
        System.out.println(solution(n, t, m, p));
    }

    private static String solution(int n, int t, int m, int p) {
        Map<Integer, Character> map = new HashMap<>(16);
        map.put(0, '0');
        map.put(1, '1');
        map.put(2, '2');
        map.put(3, '3');
        map.put(4, '4');
        map.put(5, '5');
        map.put(6, '6');
        map.put(7, '7');
        map.put(8, '8');
        map.put(9, '9');
        map.put(10, 'A');
        map.put(11, 'B');
        map.put(12, 'C');
        map.put(13, 'D');
        map.put(14, 'E');
        map.put(15, 'F');

        int totalCount = t * m;
        int value = 0;

        StringBuilder result = new StringBuilder();
        while (result.length() < totalCount) {
            if (value < n) {
                result.append(map.get(value));
            } else {
                StringBuilder sb = new StringBuilder();
                int num = value;
                while (num >= n) {
                    int v = num % n;
                    sb.append(map.get(v));
                    num /= n;
                }
                sb.append(map.get(num));
                result.append(sb.reverse());
            }
            value++;
        }

        p--;
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < t; i++) {
            s.append(result.charAt(p));
            p += m;
        }

        return s.toString();
    }

    @Test
    public void 정답() {
        Assert.assertEquals("0111", solution(2, 4, 2, 1));
        Assert.assertEquals("02468ACE11111111", solution(16, 16, 2, 1));

    }
}

