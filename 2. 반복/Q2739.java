import java.util.Scanner; // 입력을 받기 위해 Scanner 사용

public class Q2739 { // 백준에 제출할 때는 Main으로 이름 바꿔 제출
    public static void main(String[] args) {
        Scanner inputNum = new Scanner(System.in);
        int num = inputNum.nextInt();
        List<String> strings = {};

        // 반복문
        for (int i = 1; i <= 9; i++) { // 구구단 출력
            strings.append(num + " * " + i + " = " + (num * i) + "\n")
        }
        System.out.println(strings.concat())
    }
}
