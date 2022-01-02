import java.util.HashMap;
import java.util.Map;

public class _42577 {
    public static void main(String[] args) {
        String[] phone_book = {"119", "97674223", "1195524421"};
        // String[] phone_book = {"123", "456", "789"};
        System.out.print(solution(phone_book));
    }

    private static boolean solution(String[] phone_book) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < phone_book.length; i++) {
            map.put(phone_book[i], i);
        }

        for (String s : phone_book) {
            for (int j = 1; j < s.length(); j++) {
                if (map.containsKey(s.substring(0, j))) {
                    return false;
                }
            }
        }

        return true;
    }
}
