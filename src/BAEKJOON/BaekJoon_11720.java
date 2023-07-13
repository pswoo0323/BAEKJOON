package BAEKJOON;
import java.util.Scanner;
public class BaekJoon_11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();//int형 변수 n을 선언하고 값을 입력받아 저장한다.
        String input = sc.next();//String 객체 input 을 선언하고 값을 입력받아 저장한다.
        sc.close();//객채 sc사용을 종료한다.

        int sum=0;//int 형 변수 result를 선언하고 0으로 초기화
        for(int i=0; i<N; i++){
            sum = sum + input.charAt(i)-'0'; //**왜 0을 빼는지
        }
        System.out.println(sum);
    }
}
/*
** String input =sc.next();를 사용했다. 즉 "문자열"값으로 입력을 받은 것이다.
이때,문자열(string)의 각 문자(char)들은 ASCII 코드표에 나와있는 정수 값을 가지게 된다.
ex)char 형 1 = int 형 49, char 형 0 = int 형 48
만일 이 상태에서 char 형 1과 char 형 0을 더해버리면 1+0으로 생각될수도 있으나 실제로는 정수
값인 49+48이 된다. 이를 반영하여 char 형 값을 정수 값으로 활용하고 싶다면 해당 문자에서 '0'이나
'48'을 빼야한다. **
* 즉, 아스키코드는 0을 의미하는 48을 빼주면 자신의 수를 가지게 된다.
 */