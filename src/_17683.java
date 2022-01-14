import org.junit.Assert;
import org.junit.Test;

public class _17683 {
    public static void main(String[] args) {
        String m = "ABCDEFG";
        String[] musicinfos = {"12:00,12:14,HELLO,CDEFGAB", "13:00,13:05,WORLD,ABCDEF"};
        System.out.println(solution(m, musicinfos));
    }

    private static String solution(String m, String[] musicinfos) {
        String answer = "";
        int maxLength = -1;

        m = replaceMelody(m);

        for (String musicinfo : musicinfos) {
            String[] musicInfo = musicinfo.split(",");
            String title = musicInfo[2];

            String melody = replaceMelody(musicInfo[3]);

            String[] time = musicInfo[0].split(":");
            int start = Integer.parseInt(time[0]) * 60 + Integer.parseInt(time[1]);
            time = musicInfo[1].split(":");
            int end = Integer.parseInt(time[0]) * 60 + Integer.parseInt(time[1]);

            int length = end - start;
            if (length > melody.length()) {
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < length / melody.length(); i++) {
                    sb.append(melody);
                }
                sb.append(melody.substring(0, length % melody.length()));
                melody = sb.toString();
            } else {
                melody = melody.substring(0, length);
            }


            if (melody.contains(m) && length > maxLength) {
                answer = title;
                maxLength = length;
            }
        }

        return maxLength != -1 ? answer : "(None)";
    }

    private static String replaceMelody(String m) {
        m = m.replaceAll("A#", "H");
        m = m.replaceAll("C#", "I");
        m = m.replaceAll("D#", "J");
        m = m.replaceAll("F#", "K");
        m = m.replaceAll("G#", "L");
        return m;
    }

    @Test
    public void 정답() {
        Assert.assertEquals("HELLO", solution("ABCDEFG", new String[]{"12:00,12:14,HELLO,CDEFGAB", "13:00,13:05,WORLD,ABCDEF"}));
        Assert.assertEquals("FOO", solution("CC#BCC#BCC#BCC#B", new String[]{"03:00,03:30,FOO,CC#B", "04:00,04:08,BAR,CC#BCC#BCC#B"}));
        Assert.assertEquals("WORLD", solution("ABC", new String[]{"12:00,12:14,HELLO,C#DEFGAB", "13:00,13:05,WORLD,ABCDEF"}));
    }
}
