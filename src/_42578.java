import java.util.HashMap;
import java.util.Map;

public class _42578 {
    public static void main(String[] args) {
        // String[][] clothes = {{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}};
        String[][] clothes = {{"crowmask", "face"}, {"bluesunglasses", "face"}, {"smoky_makeup", "face"}};
        System.out.print(solution(clothes));
    }

    private static int solution(String[][] clothes) {
        int result = 1;
        Map<String, Integer> map = new HashMap<>();
        for (String[] clothe : clothes) {
            map.put(clothe[1], map.getOrDefault(clothe[1], 0) + 1);
        }

        for (int val : map.values()) {
            result *= (val + 1);
        }

        return result - 1;
    }
}
