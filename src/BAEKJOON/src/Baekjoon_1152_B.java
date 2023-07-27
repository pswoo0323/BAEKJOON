package BAEKJOON;
//단어의 개수
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//readLine() = String값으로 개행문자(엔터값)를 포함해 한줄을 전부 읽어오는 방식입니다.
//read() = int값으로 변형하여 읽어오는 방식입니다.
public class Baekjoon_1152_B {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = new String(br.readLine());
        StringTokenizer st = new StringTokenizer(str," ");

        System.out.println(st.countTokens());
    }
}
