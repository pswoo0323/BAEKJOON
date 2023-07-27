package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//벌집
public class Baekjoon_2292_B {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long N = Long.parseLong(br.readLine());
        int count = 1;
        int M = 1;
        while(N>M){//입력값N이 M보다 클때까지만 반복문

            M = M + (count*6);
            count++;
//58을 예로 들겠다
/*
//M은 1이고 count도 1이므로 M=7 ,N=58보다 작으므로 count++
M은 이제 7이니까 7+(2*6)=19 또 58보다 작으므로 다시count++
M은 이제 19니까 19+(3*6)=37 또 58보다 작으므로 다시count++
...
 */
        }
        System.out.println(count);
    }
}
