package BAEKJOON;
//단어 길이 재기
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2743 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();//문자열 입력값 받기
        System.out.println(str.length());//단어 길이 구하기

    }
}
