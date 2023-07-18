package BAEKJOON;
import java.util.Scanner;
public class Baekjoon_2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();//시
        int M = sc.nextInt();//분

        sc.close();

        if (M < 45) {
            H--;
            M = 60 - (45 - M);
            if (H < 0) {
                H = 23;// 0 30을 입력하면 -1 45 가 되므로 H가 0이하면 H를 23으로 선언
            }
            System.out.println(H + " " + M);
        } else {
            System.out.println(H + " " + (M - 45));
        }
    }
}
