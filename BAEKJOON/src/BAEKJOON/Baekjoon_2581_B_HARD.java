package BAEKJOON;
//소수***

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_2581_B_HARD {
    public static boolean[] bl; // 접근제어자 public 으로 메모리에 상주하게 boolean형 배열을 선언


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // byte 단위 데이터를 문자 단위 데이터로 처리할 수 있도록 변환해주기 위해서 InputStreamReader를 사용.
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        bl = new boolean[N + 1];//배열 생성
        get_bl();

        int sum = 0;
        int min = Integer.MAX_VALUE;// int형 변수 min를 선언하고 정수의 최댓값 저장
        for (int i = M; i <=N; i++) {
            if (!bl[i]){// ==> (bl[i] == false)
                sum = sum+i;
                if (min == Integer.MAX_VALUE){
                    min = i;
                }
            }
        }
        if(sum == 0){
            System.out.println(-1);// 변수 sum의 값이 0과 같을때 -1출력
        }
        else{
            System.out.println(sum);
            System.out.println(min);
        }
    }
    private static void get_bl() {// 접근제어자 public으로 메모리에 상주하게 리턴값이 없이 get_prime 함수를 선언
        bl[0] = true; // 변수 bl[0]에 true를 저장
        bl[1] = true;// 변수 bl[1]에 true를 저장한다
        // 0과 1은 소수가 아니므로 true를 저장한다
        for (int i = 2; i <= Math.sqrt(bl.length); i++) {// 2~bl.length의 제곱근까지 반복
            if (bl[i]) continue;
            for (int j = i * i; j < bl.length; j=j+i) {
                bl[j] = true;
            }
        }
    }
}
//math.sqrt = 제곱근(루트)