import java.util.HashSet;
import java.util.Set;

public class _1845 {
    public static void main(String[] args) {
        int[] nums = {3, 3, 3, 2, 2, 4};
        System.out.println(solution(nums));
    }

    private static int solution(int[] nums) {
        int size = nums.length / 2;

        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        return Math.min(set.size(), size);
    }
}
