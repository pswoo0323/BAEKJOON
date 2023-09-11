package BAEKJOON;
//문자와 문자열
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_27866 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();//문자열 입력받기
        int N = Integer.parseInt(br.readLine());//숫자 입력받기
        System.out.println(str.charAt(N-1));//charAt는 0인덱스 부터 시작하기 때문에 입력받은 정수 N에 -1 해주기

    }
}
