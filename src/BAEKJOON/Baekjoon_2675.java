package BAEKJOON;
import java.util.Scanner;
public class Baekjoon_2675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i= 0; i<T; i++){
            int R = sc.nextInt();
            String S = sc.next();
            for(int j=0; j<S.length(); j++){//문자별 for 문돌릴 곳
                for (int k = 0; k <R; k++) {//R번 반복 시킬 곳
                    System.out.print(S.charAt(j));
                }
            }
        }
    }
}
/*
T번 만큼 for 문을 작동 시킨다
R과 S를 입력받는다.
각 문자열 길이만큼 for 문을 돌린다.
R번 만큼 반복해서 출력 할  for 문을 넣는다.
for 문 탈출하고 줄바꿈 해줄 print 를 넣는다.
 */