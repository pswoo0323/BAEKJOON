package BAEKJOON;
//문자열
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Baekjoon_9086_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());//정수갑 입력(테스트 값)

        for (int i = 0; i < N; i++) {
            String str = br.readLine();//문자열 입력
            System.out.println(str.charAt(0) + "" + str.charAt(str.length() - 1));
        }//charAt(0)첫번째 문자열, charAt(str.length()-1 마지막 문자열 , ""안해주면 정수형으로 인식함
    }
}