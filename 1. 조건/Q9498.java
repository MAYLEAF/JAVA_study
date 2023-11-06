import java.util.Scanner; // 입력을 받기 위해 Scanner 사용

public class Q9498 { // 백준에 제출할 때는 Main으로 이름 바꿔 제출
    public static void main(String[] args) {
        Scanner inputScore = new Scanner(System.in); // 점수 입력 받기
        int score = inputScore.nextInt();

        // 조건문
        if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 70) {
            System.out.println("C");
        } else if (score >= 60) {
            System.out.println(("D"));
        } else {
            System.out.println("F");
        }
    }
}
