public class _12971 {
    public static void main(String[] args) {
        // int[] sticker = {14, 6, 5, 11, 3, 9, 2, 10};
        int[] sticker = {1, 3, 2, 5, 4};
        System.out.println(solution(sticker));
    }

    private static int solution(int[] sticker) {
        int answer = 0;

        int l = sticker.length;
        if (l == 1) {
            return sticker[0];
        }

        int[] dp1 = new int[l];
        dp1[0] = sticker[0];
        dp1[1] = sticker[0];
        for (int i = 2; i < l - 1; i++) {
            dp1[i] = Math.max(dp1[i - 1], dp1[i - 2] + sticker[i]);
        }
        int[] dp2 = new int[l];
        dp2[0] = 0;
        dp2[1] = sticker[1];
        for (int i = 2; i < l; i++) {
            dp2[i] = Math.max(dp2[i - 1], dp2[i - 2] + sticker[i]);
        }

        answer = Math.max(dp1[l - 2], dp2[l - 1]);


        return answer;
    }
}
