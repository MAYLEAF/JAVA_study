import java.util.Scanner; // 입력을 받기 위해 Scanner 사용

public class Q2753 { // 백준에 제출할 때는 Main으로 이름 바꿔 제출
    public static void main(String[] args) {
        Scanner inputYear = new Scanner(System.in); // 년도 입력 받기
        int year = inputYear.nextInt();

        // 조건문 - 4의 배수이면서(&&) 100의 배수가 아니거나 (||) 400의 배수일 때
        if (((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0))) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
