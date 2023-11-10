import java.util.Scanner; // 입력을 받기 위해 Scanner 사용

public class Q11718 {
    public static void main(String[] args) {
        Scanner lines = new Scanner(System.in);

        // 반복문
        while (lines.hasNextLine()) {
            String sentence = lines.nextLine();
            System.out.println(sentence);
        }
    }
}
