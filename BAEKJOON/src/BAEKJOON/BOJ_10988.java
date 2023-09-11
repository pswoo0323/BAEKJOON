package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//펠린드롬
public class BOJ_10988 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();//입력으로 문자열 받기 s
        StringBuilder sb = new StringBuilder(s);//StringBuilder sb를 받은 문자열s로 선언
        if(s.equals(sb.reverse().toString())){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }
    }
}
