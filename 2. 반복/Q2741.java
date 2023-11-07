import java.util.Scanner; // 입력을 받기 위해 Scanner 사용

public class Q2741 { // 백준에 제출할 때는 Main으로 이름 바꿔 제출
    public static void main(String[] args) {
        Scanner inpputNum = new Scanner(System.in); // 숫자 입력
        int num = inpputNum.nextInt();

        // 반복문
        for (int i = 1; i <= num; i++ ) {
            System.out.println(i);
        }
    }
    
}
