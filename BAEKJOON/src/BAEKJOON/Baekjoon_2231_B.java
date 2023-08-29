package BAEKJOON;
//분해합 **
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_2231_B {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();//216
        int str_length = str.length();//3

        int N = Integer.parseInt(str);//216 문자열을 int(정수형)으로 변환
        int result = 0;

        for (int i = (N-(str.length()*9)); i < N; i++) {//216를 예로들면 189부터 시작

            int sum = 0;
            int number = i;
            while (number != 0){
                sum = sum + number%10;    //(6)
                number = number / 10;
            }
            if (sum + i == N){     //sum + i 가 216 이라면
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}
