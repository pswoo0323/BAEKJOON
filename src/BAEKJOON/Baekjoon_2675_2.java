package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_2675_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
//String 과 문자열을 더할 때 StringBuilder 를 쓴다.
        int T = Integer.parseInt(br.readLine());//테스트케이스 입력받기
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int R = Integer.parseInt(st.nextToken());//반복횟수
            String str = st.nextToken();//문자열 입력받기

            for (int j = 0; j < str.length(); j++) {
                for (int k = 0; k < R; k++) {
                    sb.append(str.charAt(j));//
                    //charAt(n) -> n번째 위치의 문자를 char 형태로 변환함
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
