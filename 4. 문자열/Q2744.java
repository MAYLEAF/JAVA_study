import java.util.Scanner; // 입력을 받기 위해 Scanner 사용

public class Q2744 {
    public static void main(String[] args) {
        Scanner inputWord = new Scanner(System.in);
        String word = inputWord.nextLine();
        char[] eachChar = new char[word.length()];

        // 반복문 - 한 글자씩 떼서 비교
        for (int i = 0; i < word.length(); i++) {
            eachChar[i] = word.charAt(i);
            if (Character.isUpperCase(eachChar[i])) {
                eachChar[i] = Character.toLowerCase(eachChar[i]);
            } else {
                eachChar[i] = Character.toUpperCase(eachChar[i]);
            }
        }

        System.out.println(eachChar);
    }
}
