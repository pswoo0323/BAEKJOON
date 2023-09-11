package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_10950 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());//테스트케이스의 개수

        StringBuilder sb = new StringBuilder();//저장후 한번에 출력하기 위해

        for (int i = 0; i <T ; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine(), " ");//칸구분
            int A = Integer.parseInt(st.nextToken());//정수로 변환
            int B = Integer.parseInt(st.nextToken());
            sb.append(A+B);
            sb.append('\n');
        }
        System.out.println(sb);
    }
}
