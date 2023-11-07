import java.util.Scanner; // 입력을 받기 위해 Scanner 사용

public class Q10951 { // 백준에 제출할 때는 Main으로 이름 바꿔 제출
    public static void main(String[] args) {
        Scanner theNums = new Scanner(System.in);

        // 반복문
        while(theNums.hasNextInt()) { // 숫자가 입력이 다 될 때까지 반복해서 합 계산
            int a = theNums.nextInt();
            int b = theNums.nextInt();
            int sum = a + b;
            System.out.println(sum);
        }
    }
}