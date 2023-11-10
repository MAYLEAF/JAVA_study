import java.util.Scanner; // 입력을 받기 위해 Scanner 사용

public class Q27866 {
    public static void main(String[] args) {
        Scanner inputWords = new Scanner(System.in);
        String word = inputWords.next();
        int num = inputWords.nextInt();

        System.out.println(word.charAt(num - 1)); // -1을 해주는 이유: index는 0부터 시작하지만, 출력하고자 하는 것은 몇번째 문자(1부터 시작)
    }
}
