public class _12951 {
    public static void main(String[] args) {
        // String s = "3people unFollowed me";
        String s = "for the last week";
        System.out.print(solution(s));
    }

    private static String solution(String s) {
        String[] arr = s.split(" ");
        for (int i = 0; i < arr.length; i++) {
            char[] chars = arr[i].toCharArray();
            if ('a' <= chars[0] && chars[0] <= 'z') {
                chars[0] = Character.toUpperCase(chars[0]);
            } else {
                if ('a' <= chars[1] && chars[1] <= 'z') {
                    chars[1] = Character.toUpperCase(chars[1]);
                }
            }
            arr[i] = String.valueOf(chars);
        }
        return String.join(" ", arr);
    }
}
