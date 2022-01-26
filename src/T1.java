import java.util.*;

public class T1 {

    public static String[] uniqueNames(String[] names1, String[] names2) {
        // throw new UnsupportedOperationException("Waiting to be implemented.");
        List<String> list = new ArrayList<>();
        for (int i = 0; i < names1.length; i++) {
            if (!list.contains(names1[i])) {
                list.add(names1[i]);
            }
        }
        for (int i = 0; i < names2.length; i++) {
            if (!list.contains(names2[i])) {
                list.add(names2[i]);
            }
        }
        String[] result = new String[list.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i);
        }
        return result;

    }

    public static void main(String[] args) {
        String[] names1 = new String[]{"Ava", "Emma", "Olivia"};
        String[] names2 = new String[]{"Olivia", "Sophia", "Emma"};
        System.out.println(String.join(", ", T1.uniqueNames(names1, names2))); // should print Ava, Emma, Olivia, Sophia
    }
}