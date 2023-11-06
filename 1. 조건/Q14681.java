import java.util.Scanner; // 입력을 받기 위해 Scanner 사용

public class Q14681 { // 백준에 제출할 때는 Main으로 이름 바꿔 제출
    public static void main(String[] args) {
        Scanner inputLoc = new Scanner(System.in); // 위치 입력 받기(숫자 2개 입력)
        int x = inputLoc.nextInt(); // 처음 입력 값 = x
        int y = inputLoc.nextInt(); // 두번째 입력 값 = y

        // 조건문
        if (x > 0 && y > 0) {
            System.out.println(1);
        } else if (x < 0 && y > 0) {
            System.out.println(2);
        } else if ( x < 0 && y < 0) {
            System.out.println(3);
        } else {
            System.out.println(4);
        }
    }
}
