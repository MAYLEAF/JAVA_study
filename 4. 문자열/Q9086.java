import java.util.Scanner; // 입력을 받기 위해 Scanner 사용

public class Q9086 {
    public static void main(String[] args) {
        Scanner sentences = new Scanner(System.in);
        int count = Integer.parseInt(sentences.nextLine()); // 문자열로 입력 받은 값을 숫자로 변환

        for (int i = 0; i < count; i++) {
            String sentence = sentences.nextLine();
            System.out.println(sentence.charAt(0) + "" + sentence.charAt(sentence.length() - 1)); // 제일 앞, 뒤 자리의 문자 받아오기, 중간에 ""를 더해준 이유는 그냥 +만 할 경우 숫자로 변환해버리기 때문
        }
    }
}
