package BAEKJOON;
import java.util.Scanner;
public class BaekJoon_10810 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();//N번 까지의 공의 번호
        int M = sc.nextInt();////공을 넣는 횟수
        int arr[] = new int[N+1];

        for (int i = 0; i < M; i++) {
            int F = sc.nextInt();
            int E = sc.nextInt();
            int ball = sc.nextInt();
            for(int j=F; j<=E; j++) arr[j] = ball;//
        }
        for(int i=1; i<arr.length; i++)
            System.out.print(arr[i]+" ");

    }
}
