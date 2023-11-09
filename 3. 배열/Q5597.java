import java.util.Scanner; // 입력을 받기 위해 Scanner 사용

public class Q5597 {
    public static void main(String[] args) {
        Scanner nums = new Scanner(System.in);
        int[] allStudents = new int[31]; // 총 30명의 학생(1-30번을 위해 총 31칸 배열 생성)
        int[] students = new int[28]; // 제출한 28명의 학생
        int[] donotSubmit = new int[2]; // 제출하지 않은 2명의 학생

        // 반복문 - 선언된 배열에 값 입력
        for (int i = 0; i < 28; i++) {
            students[i] = nums.nextInt();
        }

        // 반복문 - counting sort 이용
        // 전체 배열(allStudents)이 0으로 초기화되어 있는 상태에서
        // 제출한 학생 번호에 맞게 1 대입 - 0번과 2개 자리가 빠져 있을 것.
        for (int i = 0; i < 28; i++) {
            allStudents[students[i]] = 1;
        }

        // 반복문 - 0이 찍혀있는 자리 확인
        int count = 0;
        for (int num = 1; num <= 30; num++) {
            if (allStudents[num] == 0) {
                donotSubmit[count] = num;
                count++;
            }
        }

        // 반복문 - 차례로 출력(작은 수부터 자동으로 저장되어 있음)
        for (int i = 0; i < 2; i++) {
            System.out.println(donotSubmit[i]);
        }
    }
}
