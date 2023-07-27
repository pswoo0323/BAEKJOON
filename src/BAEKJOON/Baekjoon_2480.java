package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_2480 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        if (a != b && b != c && a != c) {
            int max = Math.max(a, Math.max(b, c));//최대수
            System.out.println(max * 100);

        } else {
            if (a == b && a == c) {//모두 같을 때
                System.out.println(10000 + a * 1000);
            } else if (b == a && b == c) {
                System.out.println(10000 + b * 1000);
            } else if (c == a && c == b) {
                System.out.println(10000 + c * 1000);

            } else {//2개만 같을 때
                if (a == b || a == c) {
                    System.out.println(1000 + a * 100);
                } else if (b == c || b == a) {
                    System.out.println(1000 + b * 100);
                } else if (c == a || c == b) {
                    System.out.println(1000 + c * 100);
                }
            }
        }
    }
}