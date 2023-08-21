package BAEKJOON;
//X보다 작은 수
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_10871 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");//첫째 줄의 공백
        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        int arr[] = new int[N];

        st = new StringTokenizer(br.readLine()," ");//둘째 줄의 공백
        for (int i = 0; i <arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if(arr[i]<X){
                sb.append(arr[i]).append(" ");
            }
        }
        System.out.println(sb);
    }
}
