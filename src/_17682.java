public class _17682 {
    public static void main(String[] args) {
        // String dartResult = "1S2D*3T";
        // String dartResult = "1D2S#10S";
        // String dartResult = "1D2S0T";
        // String dartResult = "1S*2T*3S";
        // String dartResult = "1D#2S*3S";
        // String dartResult = "1T2D3D#";
        String dartResult = "1D2S3T*";
        System.out.println(solution(dartResult));
    }

    private static int solution(String dartResult) {
        int[] scores = new int[3];
        int scoresIndex = 0;

        for (int i = 0; i < dartResult.length(); i++) {
            if ('0' <= dartResult.charAt(i) && dartResult.charAt(i) <= '9') {
                if (dartResult.charAt(i + 1) != '0') {
                    scores[scoresIndex] = dartResult.charAt(i) - '0';
                } else {
                    scores[scoresIndex] = 10;
                    i++;
                }
                scoresIndex++;
            } else if (dartResult.charAt(i) == 'D') {
                scores[scoresIndex - 1] = (int) Math.pow(scores[scoresIndex - 1], 2);
            } else if (dartResult.charAt(i) == 'T') {
                scores[scoresIndex - 1] = (int) Math.pow(scores[scoresIndex - 1], 3);
            } else if (dartResult.charAt(i) == '*') {
                scores[scoresIndex - 1] *= 2;
                if (scoresIndex > 1) {
                    scores[scoresIndex - 2] *= 2;
                }
            } else if (dartResult.charAt(i) == '#') {
                scores[scoresIndex - 1] *= -1;
            }
        }

        return scores[0] + scores[1] + scores[2];
    }
}
