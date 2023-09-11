package BAEKJOON;
//숫자의 합
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_11720_2 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());//숫자 N개 입력
        int sum = 0;

        for (int i = 0; i <N; i++) {
            sum = sum + br.read() - 48;//48은 ascii 코드 값 0임
        }
        System.out.println(sum);
    }
}
