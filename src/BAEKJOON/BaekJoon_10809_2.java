package BAEKJOON;
import java.util.Scanner;
public class BaekJoon_10809_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        for(char i='a'; i<='z'; i++){
            System.out.print(s.indexOf(i)+ " ");
        }
    }
}
/*
indexOf 는 특정 문자나 문자열이 앞에서부터 처음 발견되는 인덱스를 변환하며
만약 찾지 못했을 경우 "-1" 을 반환한다.

 */