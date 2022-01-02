import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class _12981 {
    public static void main(String[] args) {
        // int n = 3; String[] words = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
        // int n = 5;         String[] words = {"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"};
        int n = 2;
        String[] words = {"hello", "one", "even", "never", "now", "world", "draw"};
        System.out.println(Arrays.toString(solution(n, words)));
    }

    private static int[] solution(int n, String[] words) {
        int[] result = {0, 0};
        Set<String> set = new HashSet<>();
        set.add(words[0]);
        int player = 2;
        for (int i = 1; i < words.length; i++) {
            if (set.contains(words[i]) || isValid(words[i - 1], words[i])) {
                result[0] = player;
                result[1] = (i / n) + 1;
                break;
            } else {
                set.add(words[i]);
                player++;
                if (player % (n + 1) == 0) {
                    player = 1;
                }
            }
        }
        return result;
    }

    private static boolean isValid(String word1, String word2) {
        return word1.charAt(word1.length() - 1) != word2.charAt(0);
    }
}
