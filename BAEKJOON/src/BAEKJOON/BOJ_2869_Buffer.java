package BAEKJOON;
//달팽이 , 생각보다 어려웠다 로직을 짜는데 시간 겁나 오래걸렸음
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2869_Buffer {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        int C =(V-B)/(A-B);
        if ((V-B)%(A-B)!=0) C++;
        System.out.println(C);
    }
}
