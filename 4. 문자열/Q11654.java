import java.util.Scanner; // 입력을 받기 위해 Scanner 사용

public class Q11654 {
    public static void main(String[] args) {
        Scanner character = new Scanner(System.in);
        char theChar = character.next().charAt(0); // 문자열 첫 부분
        int asciiNum = (int)theChar; // 문자열로 받은 부분 -> int로 받을 경우 ASCII 문자의 해당 숫자로 변환

        System.out.println(asciiNum);
    }
}
