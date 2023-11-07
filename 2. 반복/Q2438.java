import java.util.Scanner; // 입력을 받기 위해 Scanner 사용

public class Q2438 { // 백준에 제출할 때는 Main으로 이름 바꿔 제출
    public static void main(String[] args) {
        Scanner inputNum = new Scanner(System.in);
        int stars = inputNum.nextInt();
        // String line = ""; // 빈 문자열 만들기

        // 반복문
        // for (int i = 1; i <= stars; i++) {
        //     line += "*"; // 문자열에 별 하나씩 추가
        //     System.out.println(line);// 문자열 출력
        // }

        // 반복문
        for (int i = 1; i <= stars; i++) {
            String line = "*".repeat(i); // java 11 버전부터 추가된 문자열 반복 메서드
            System.out.println(line);
        }
    }
}
