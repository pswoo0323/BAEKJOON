package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//reverse 사용
public class Baekjoon_2908_2 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");//구분자를 기준으로 문자열 분리
        int A = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
        int B = Integer.parseInt((new StringBuilder(st.nextToken()).reverse().toString()));
            //parseInt : 문자열을 숫자로 변환시킴
        System.out.println(A>B ? A:B);
    }
}
