package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_18108 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int year = Integer.parseInt(str);//숫자형식의 문자열을 정수형으로 반환해줌.

        System.out.println(year - 543);
    }
}
