package BAEKJOON;

import java.util.Scanner;
import java.util.StringTokenizer;

//단어의 개수
public class Baekjoon_1152_S {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        StringTokenizer st = new StringTokenizer(s," ");

        System.out.println(st.countTokens());//countTokens 는 토큰의 개수 세기
    }
}
