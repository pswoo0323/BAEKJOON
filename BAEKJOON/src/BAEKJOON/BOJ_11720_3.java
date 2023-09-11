package BAEKJOON;
//숫자의 합, 배열
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_11720_3 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String arr[] = br.readLine().split("");
        int sum = 0;
        for (int i = 0; i <N; i++) {
            sum = sum + Integer.parseInt(arr[i]);
        }
        System.out.println(sum);
    }
}
