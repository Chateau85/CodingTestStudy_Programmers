public class _12911 {
    public static void main(String[] args) {
        int n = 1000000;
        System.out.print(solution(n));
    }

    private static int solution(int n) {
        int result;
        int nextNum = n + 1;
        int bitCount = get1BitCount(n);
        while (true) {
            int bitCountNextNum = get1BitCount(nextNum);
            if (bitCount == bitCountNextNum) {
                result = nextNum;
                break;
            }
            nextNum++;
        }
        return result;
    }

    private static int get1BitCount(int n) {
        String t = Integer.toBinaryString(n);
        t = t.replace("0", "");
        return t.length();
    }
}
