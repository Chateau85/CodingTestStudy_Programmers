import java.util.*;

public class _49994 {
    public static void main(String[] args) {
        // String dirs = "ULURRDLLU";
        String dirs = "LULLLLLLU";
        System.out.println(solution(dirs));
    }

    private static int solution(String dirs) {
        int[] p = {0, 0};
        Set<String> set = new HashSet<>();
        int answer = 0;
        int currX = 0, currY = 0, nextX = 0, nextY = 0;
        for (int i = 0; i < dirs.length(); i++) {
            if (dirs.charAt(i) == 'U') {
                if (currY + 1 <= 5) {
                    nextY = currY + 1;
                    String fromTo = currX + "" + currY + "" + nextX + "" + nextY;
                    String toFrom = nextX + "" + nextY + "" + currX + "" + currY;
                    set.add(fromTo);
                    set.add(toFrom);

                    currX = nextX;
                    currY = nextY;
                }
            } else if (dirs.charAt(i) == 'D') {
                if (currY - 1 >= -5) {
                    nextY = currY - 1;
                    String fromTo = currX + "" + currY + "" + nextX + "" + nextY;
                    String toFrom = nextX + "" + nextY + "" + currX + "" + currY;
                    set.add(fromTo);
                    set.add(toFrom);
                    currX = nextX;
                    currY = nextY;
                }
            } else if (dirs.charAt(i) == 'R') {
                if (currX + 1 <= 5) {
                    nextX = currX + 1;
                    String fromTo = currX + "" + currY + "" + nextX + "" + nextY;
                    String toFrom = nextX + "" + nextY + "" + currX + "" + currY;
                    set.add(fromTo);
                    set.add(toFrom);
                    currX = nextX;
                    currY = nextY;
                }
            } else {
                if (currX - 1 >= -5) {
                    nextX = currX - 1;
                    String fromTo = currX + "" + currY + "" + nextX + "" + nextY;
                    String toFrom = nextX + "" + nextY + "" + currX + "" + currY;
                    set.add(fromTo);
                    set.add(toFrom);
                    currX = nextX;
                    currY = nextY;
                }
            }
        }

        answer = set.size() / 2;
        return answer;
    }

}
