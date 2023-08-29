package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_1978_B2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        br.readLine();
        int count = 0;

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        while (st.hasMoreTokens()){
            //소수인경우 true, 소수아닌경우 false
            boolean bl = true;
            int num = Integer.parseInt(st.nextToken());

            if (num == 1){
                continue;
            }
            for (int i = 2; i <=Math.sqrt(num); i++) {
                if (num % i == 0){
                    bl = false;
                    break;
                }
            }
            if (bl){
                count++;
            }
        }
        System.out.println(count);
    }
}
