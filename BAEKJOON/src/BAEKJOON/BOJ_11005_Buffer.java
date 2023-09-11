package BAEKJOON;
//진법 변환2
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_11005_Buffer {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int N = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();

        while (N > 0){//60466175를 36으로 0보다 클 때까지 나누기
            if(N % B >= 10)//10 이상 부터는 "A,B,C...."
                sb.append((char) ((N%B)+ 55));//10부터55더하면 아스키코드 대문자"A,B,C...."
            else sb.append(N%B);//10 이상 아니면 그냥 출력
            N = N / B;
        }
        System.out.println(sb.reverse().toString());//결과 거꾸로 읽기
    }
}
