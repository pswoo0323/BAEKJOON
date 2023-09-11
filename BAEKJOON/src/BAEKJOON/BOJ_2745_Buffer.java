package BAEKJOON;
//진법 변환
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2745_Buffer {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        String N = st.nextToken();//수 [10진수를 제외한 나머지 진수는 String으로 받아야 한다]
        int B = Integer.parseInt(st.nextToken());//B진법

        System.out.println(Integer.parseInt(N,B));
    }
}