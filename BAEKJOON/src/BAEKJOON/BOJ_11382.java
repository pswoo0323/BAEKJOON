package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_11382 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str," ");

        long a =Long.parseLong(st.nextToken());//c<=10^12 이므로 int형을 쓰면 틀림.
        long b =Long.parseLong(st.nextToken());
        long c =Long.parseLong(st.nextToken());

        System.out.println(a+b+c);

    }
}
