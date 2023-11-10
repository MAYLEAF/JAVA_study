import java.util.Scanner; // 입력을 받기 위해 Scanner 사용

public class Q2754 {
    public static void main(String[] args) {
        Scanner scoreInput = new Scanner(System.in);
        String[] scoreAlpha = {"A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D+", "D0", "D-", "F"};
        double[] scoreNum = {4.3, 4.0, 3.7, 3.3, 3.0, 2.7, 2.3, 2.0, 1.7, 1.3, 1.0, 0.7, 0.0};
        String score = scoreInput.next();

        for (int i = 0; i < 13; i++) {
            if (score.equals(scoreAlpha[i])) {
                System.out.println(scoreNum[i]);
                break;
            }
        }
    }
}
