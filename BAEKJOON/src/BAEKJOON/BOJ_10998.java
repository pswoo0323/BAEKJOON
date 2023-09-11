package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_10998 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();//readLine(행)
        StringTokenizer st = new StringTokenizer(str," ");
        //StringTokenizer ("문자열",구분자)
        int a = Integer.parseInt(st.nextToken());//구분된 변수를 꺼낼 때는 차례대로 nextToken();을 해주면 문자열을 반환해줌.
        int b = Integer.parseInt(st.nextToken());////문자열을 반환했으니 int형으로 변환
        System.out.println(a*b);
    }
}
/*
        굳이 String 변수 생성 안하고 입력과 동시에 구분자로 분리해줘도 된다.

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(),"");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());

		System.out.println(a*b);
         */