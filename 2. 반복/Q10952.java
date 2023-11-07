import java.util.Scanner; // 입력을 받기 위해 Scanner 사용

public class Q10952 { // 백준에 제출할 때는 Main으로 이름 바꿔 제출
    public static void main(String[] args) {
        Scanner theNums = new Scanner(System.in); // 더하고자 하는 숫자 목록들 입력
        int a;
        int b;

        // 반복문
        while(true) { // 무한 루프
            a = theNums.nextInt();
            b = theNums.nextInt();
            int sum = a + b;

            // 조건문 - 합을 출력 하기 전 조건 확인
            if (a == 0 && b == 0) { // a와 b 둘 다 0이면 while문 빠져나가기
                break; // 0 + 0의 합을 출력하지 않는다.(예시 참고)
            }
            System.out.println(sum); // 두 수의 합 출력
        }
    }
}
