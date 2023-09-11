package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class BOJ_2566 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int arr[][] = new int[9][9];
        int max = 0;
        int x = 0;
        int y = 0;

        for (int i = 0; i <9 ; i++) {
            st = new StringTokenizer(br.readLine());//br.readLine()의 return은 String이므로 String으로 입력을 받아야한다.
            for (int j = 0; j <9 ; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                if(arr[i][j]>=max){//0일수도 있다했으니
                    max = arr[i][j];
                    x = i+1;
                    y=  j+1;
                }
            }
        }
        System.out.println(max);
        System.out.println(x + " " + y);
        br.close();
    }
}
