package BAEKJOON;
//세탁소 사장 동혁
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2720_Buffer {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int Quarter = 25;
        int Dime = 10;
        int Nickel = 5;
        int Penny = 1;

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i <T; i++) {
            int C = Integer.parseInt(br.readLine());
            //ex)124
            Quarter = C/25;  //C를 124로 예들 들었으니 C/25 = 4
            C = C% 25;  //124%25 = 24
            Dime = C/10;  //이제 C 가 24로 바뀌었다. 24/10 = 2
            C = C%10;  //24%10=4
            Nickel = C/5;  //C가 4로 바뀜  4/5=0
            C = C%5;  //4%5=4
            Penny = C/1;  // 4/1=4

            System.out.println(Quarter+" " + Dime+" "+Nickel+" "+Penny);
        }
    }
}
