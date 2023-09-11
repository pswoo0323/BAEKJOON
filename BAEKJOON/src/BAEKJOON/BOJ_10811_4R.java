package BAEKJOON;
//바구니 뒤집기**
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_10811_4R {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int arr[] = new int[N];
        for (int i = 0; i <N; i++) {
            arr[i] = i +1;//배열은 0부터 시작하기 때문에 arr[0]에 1을 넣기위해 1을 더해줌.
        }
        for (int i = 0; i <M; i++) {
            StringTokenizer st1 = new StringTokenizer(br.readLine()," ");
            int a = Integer.parseInt(st1.nextToken()) -1;//배열 0부터 시작
            int b = Integer.parseInt(st1.nextToken()) -1;//배열 0부터 시작

            while (a<b){
                int temp = arr[a];
                arr[a++]= arr[b];
                arr[b--]= temp;
            }
        }
        for(int basket : arr)
            System.out.print(basket + " ");
    }
}
