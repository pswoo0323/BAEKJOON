package BAEKJOON;
//곱셈 toCharArray
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2588 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        String b = br.readLine();

        char[] B = b.toCharArray();
//toCarArray: 문자열을 한 글짜씩 쪼개서 char타입의 배열에 집어넣어주는 메소드
        System.out.println(a * (B[2] - '0'));
        System.out.println(a * (B[1] - '0'));
        System.out.println(a * (B[0] - '0'));
        System.out.println(a * Integer.parseInt(b));
    }
}
