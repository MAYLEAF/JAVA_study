import java.util.Scanner; // 입력을 받기 위해 Scanner 사용

public class Q10950 { // 백준에 제출할 때는 Main으로 이름 바꿔 제출
    public static void main(String[] args) {
        Scanner inputNums = new Scanner(System.in); // 테스트 케이스 개수 입력
        int testCount = inputNums.nextInt();
        int a;
        int b;

        // 반복문
        for (int i = 0; i < testCount; i++) { // 반복문의 역할: 테스트 케이스 개수만큼 반복
            a = inputNums.nextInt();
            b = inputNums.nextInt();
            int sum = a + b;
            System.out.println(sum); // 두 수의 합 출력
        }
    }
}
