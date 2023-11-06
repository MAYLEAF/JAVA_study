import java.util.Scanner; // 입력을 받기 위해 Scanner 사용

public class Q2420 { // 백준에 제출할 때는 Main으로 이름 바꿔 제출
    public static void main(String[] args) {
        Scanner domainsFamous = new Scanner(System.in); // 2개의 입력 받음 - 각 도메인의 유명도
        long famousA = domainsFamous.nextLong(); // 범위가 -20억부터 20억까지이므로 int가 아닌 long으로 받음
        long famousB = domainsFamous.nextLong();
        long subtract = famousA - famousB; // 유명도의 차이

        // 조건문
        if (subtract < 0) { // 두 유명도를 뺐을 때 음수가 나오는 경우(ex) -2(A) - 5(B) = -7)
            System.out.println(subtract * -1);
        } else {
            System.out.println((subtract));
        }
    }
}
