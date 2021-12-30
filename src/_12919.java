public class _12919 {
    public static void main(String[] args) {
        String[] seoul = {"Jane", "Kim"};
        System.out.print(solution(seoul));
    }

    private static String solution(String[] seoul) {
        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                return "김서방은 " + i + "에 있다";
            }
        }
        return "";
    }
}
