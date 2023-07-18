package BAEKJOON;
import java.util.Scanner;
public class Baekjoon_9086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();//테스트케이스 개수 선언
         for(int i=0; i<N; i++){//시작은0 이고 우리의 입력은 1이상이므로 반복문 계속돌아감
             String input = sc.next();
             System.out.println(input.charAt(0)+""+input.charAt(input.length()-1));
             //char + char을 하면 아스키코드로 인해 int로 계산된다.
             //이를 방지하고 문자열 더하기를 해주기 위해
             //' ""+  '를 추가해주거나 'String.valueOf(~) + String.valueOf(~)'를 사용해주면 된다.
/*
입력된 문자에서의 0번째의 문자와 길이를 구해서 -1을 한 위치의 문자를 출력한다.
만약에 문자가 ABCD로 입력됬을때 str.length()의 결과는 4를 출력하게 된다.
하지만 문자열을 저장할때는 0번 index부터 저장하기에 3번 index가 D의 값을 저장할 것이다.
즉, array[0]과 array[3]을 출력하면 각각 A와 D를 출력하게 된다
 */

         }
    }
}
//charAt() 함수는 String 타입의 데이터(문자열)에서 특정문자를 char타입으로 변환할 때 사용
/*
<CharAt 예시 >
 String example = "안녕하세요";

 target1 = example.charAt(0);
 target2 = example.charAt(1);
 target3 = example.charAt(2);

example 의 문자열인 "안녕하세요" 기준으로
target1은 0번째 인덱스의 "안"을 출력
target2은 1번째 인덱스의 "녕"을 출력
target3은 2번째 인덱스의 "하"을 출력한다.

char + char을 하면 아스키코드로 인해 int로 계산된다.
이를 방지하고 문자열 더하기를 해주기 위해,' ""+  '를 추가해주거나
'String.valueOf(~) + String.valueOf(~)'를 사용해주면 된다.
 */