import java.util.Scanner; // 입력을 받기 위해 Scanner 사용

public class Q1330 { // 백준에 제출할 때는 Main으로 이름 바꿔 제출
    public static void main(String[] args) {
        Scanner inputNum = new Scanner(System.in); // 띄어쓰기를 이용하여 2가지 정수를 입력받음
        int a = inputNum.nextInt();
        int b = inputNum.nextInt();

        // 조건문
        if (a > b) {
            System.out.println(">");
        } else if (a < b) {
            System.out.println("<");
        } else {
            System.out.println("==");
        }
    }
}
