import java.util.Scanner; // 입력을 받기 위해 Scanner 사용

public class Q10872 { // 백준에 제출할 때는 Main으로 이름 바꿔 제출
    public static void main(String[] args) {
        Scanner inputNum = new Scanner(System.in); // 숫자 입력
        int factNum = inputNum.nextInt();
        int factorial = 1; // 팩토리얼 계산을 위해 초기 값을 1로 설정

        // 반복문
        for (int i = 1; i <= factNum; i++) {
            factorial *= i; // for문이 돌아가는 동안 초기 값에 i값을 순서대로 곱함
        }
        System.out.println(factorial); // 팩토리얼 계산 끝난 후 출력
    }
}