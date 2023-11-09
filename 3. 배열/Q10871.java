import java.util.Scanner; // 입력을 받기 위해 Scanner 사용

public class Q10871 {
    public static void main(String[] args) {
        Scanner inputNums = new Scanner(System.in);
        int count = inputNums.nextInt(); // 처음 입력된 값: 배열 안의 숫자 개수
        int standardNum = inputNums.nextInt(); // 두번째 입력된 값: 비교 기준 값
        int[] intArray = new int[count]; // 배열 선언

        // 반복문 - 선언한 배열에 값 입력하기
        for (int i = 0; i < count; i++) {
            intArray[i] = inputNums.nextInt();
        }

        // 반복문 - 배열 내에서 값 하나씩 확인
        for (int numPointer = 0; numPointer < count; numPointer++) {
            // 조건문 - 기준이 되는 값과 크기 비교
            if (intArray[numPointer] < standardNum) {
                System.out.print(intArray[numPointer] + " ");
            }
        }
    }
}
