public class _82612 {
    public static void main(String[] args) {
        int price = 3, money = 20, count = 4;
        System.out.print(solution(price, money, count));
    }

    private static long solution(int price, int money, int count) {
        long proc = 0;
        for (int i = 1; i <= count; i++) {
            proc += (long) price * i;
        }
        return proc > money ? proc - money : 0;
    }
}
