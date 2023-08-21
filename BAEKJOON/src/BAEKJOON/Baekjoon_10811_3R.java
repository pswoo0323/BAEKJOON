package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_10811_3R {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        //st라는 변수에 입력받은 값들을 띄어쓰기단위로 나누어 토큰에 담는다.
        // String형으로 담긴다.

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        // 각각의 Int형 변수에 첫번째 토큰을 Int형으로 변환하여 담는다.
        // N개의 바구니를 M번 범위를 지정해 순서를 바꿀 계획이다.


        int basket[] = new int[N+1];
        // 1부터 N번 바구니를 담을 배열을 만든다.

        // N개의 바구니에 1번부터 N번까지 반복문으로 번호를 달아준다.
        for (int i = 1; i <=N; i++) {
            basket[i] = i;
            // 1번바구니 : 1, 	2번바구니:2...처럼 바구니에 값을 담아준다.
        }

        // 이제 M번만큼 범위(a~b)를 지정해 순서를 바꿔보자.
        for (int i = 1; i <=M; i++) {
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st1.nextToken());
            //역순으로 변환할 범위중 시작 바구니 번호
            int b = Integer.parseInt(st1.nextToken());
            //역순으로 변환할 범위중 종료 바구니 번호

            //a가 b보다 크거나 같게 입력되면 오류이기 때문에
            //a<b일 때만 계산되도록 if문을 만든다.

            if (a<b) {

                int temp[] = new int[N+1];
                // 바구니수만큼의 temp배열을 만든다.

                for (int j = 0; j <= b-a; j++) {
                    temp[j] = basket[b-j];
                    //a~b까지의 바구니의 번호를 뒤집어서 담기위해
                    //b-a만큼 for문을 돌린다.
                }

                // b가 4, a가 1이라 가정하면, 반복문 4번 실행
                // 1. temp[j(0)]에 basket[b-j(4)] 넣음 = temp[0]에 basket[4] 넣음
                // 2. temp[j(1)]에 basket[b-j(3)] 넣음 = temp[1]에 basket[3] 넣음
                // 3. temp[j(2)]에 basket[b-j(2)] 넣음 = temp[2]에 basket[2] 넣음
                // 4. temp[j(3)]에 basket[b-j(1)] 넣음 = temp[3]에 basket[1] 넣음

                for (int k = 0; k <= b-a; k++) {
                    basket[a+k] = temp[k];
                    // temp의 값을 차례대로 넣음
                    // 4,3,2를 2,3,4순으로 빼내었다가 다른 배열에 2,3,4순으로 담는 방식
                }
            }
        }
        for (int i = 1 ; i <=N; i++) {
            System.out.print(basket[i]+ " ");
        }
    }
}
