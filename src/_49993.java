import java.util.ArrayList;
import java.util.List;

public class _49993 {
    public static void main(String[] args) {
        String skill = "CBD";
        String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};
        System.out.println(solution(skill, skill_trees));
    }

    private static int solution(String skill, String[] skill_trees) {
        int answer = 0;

        List<String> list = new ArrayList<>();
        for (String skill_tree : skill_trees) {
            StringBuilder sb = new StringBuilder();
            char[] treeItem = skill_tree.toCharArray();
            for (char c : treeItem) {
                for (int k = 0; k < skill.length(); k++) {
                    if (c == skill.charAt(k)) {
                        sb.append(c);
                    }
                }
            }
            list.add(sb.toString());
        }

        for (String s : list) {
            if (skill.indexOf(s) == 0) {
                answer++;
            }
        }

        return answer;
    }
}
