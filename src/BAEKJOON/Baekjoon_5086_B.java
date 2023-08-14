package BAEKJOON;
//배수와 약수
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_5086_B {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            if(N==0 && M==0) break;
            if(M%N==0){
                System.out.println("factor");
            }
            else if(N%M==0){
                System.out.println("multiple");
            }
            else{
                System.out.println("neither");
            }
        }
    }
}
