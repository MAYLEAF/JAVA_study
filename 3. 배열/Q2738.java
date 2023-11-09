import java.util.Scanner; // 입력을 받기 위해 Scanner 사용

public class Q2738 {
    public static void main(String[] args) {
        Scanner nums = new Scanner(System.in);
        int row = nums.nextInt();
        int column = nums.nextInt();
        int[][] matrixA = new int[row][column]; // 행렬 A
        int[][] matrixB = new int[row][column]; // 행렬 B
        int[][] sumMatrix = new int[row][column]; // 두 행렬의 합을 저장하는 새로은 행렬

        // 반복문 - 이차원 배열에 값 저장
        for (int i = 0; i < row; i++) { // 행렬 A
            for (int j = 0; j < column; j++) {
                matrixA[i][j] = nums.nextInt();
            }
        }
        for (int i = 0; i < row; i++) { // 행렬 B
            for (int j = 0; j < column; j++) {
                matrixB[i][j] = nums.nextInt();
            }
        }

        // 두 행렬의 합 구하기 및 출력
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                sumMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
                System.out.print(sumMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
