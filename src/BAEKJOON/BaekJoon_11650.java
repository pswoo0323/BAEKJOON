package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//좌표 정렬하기
public class BaekJoon_11650 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int arr[][] = new int[N][2];

        StringTokenizer st = new StringTokenizer(br.readLine());//특정 문자에 따라 문자열을 나눌때 사용 ex)new StringTokenizer(문자열,구분자,true/false);
        for (int i = 0; i < N; i++) {
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
    }
}
