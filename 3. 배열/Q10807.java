import java.util.Scanner; // 입력을 받기 위해 Scanner 사용

public class Q10807 {
    public static void main(String[] args) {
        Scanner inputNums = new Scanner(System.in);
        int count = inputNums.nextInt(); // 처음 입력된 값: 정수의 개수
        int[] nums = new int[count]; // 배열 선언

        // 반복문 - 선언된 배열에 값 입력하기
        for (int i = 0; i < count; i++) {
            nums[i] = inputNums.nextInt();
        }

        int standardNum = inputNums.nextInt(); // 마지막 입력된 값: 비교 대상 숫자
        int sameCount = 0; // 같은 숫자 개수

        for (int numPointer = 0; numPointer < count; numPointer++) {
            // 조건문 - 비교 대상 숫자와 배열 내의 숫자 비교
            if (nums[numPointer] == standardNum) {
                sameCount++; // 같은 경우, 카운트 수 증가
            }
        }

        System.out.println(sameCount);
    }
}
