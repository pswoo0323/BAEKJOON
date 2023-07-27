package BAEKJOON;
//개수 세기
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_10807 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int arr[] = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        for (int i = 0; i <arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int V = Integer.parseInt(br.readLine());//찾으려고하는 정수 = V
        int count = 0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==V){
                count++;
            }
        }
        System.out.println(count);
    }
}
