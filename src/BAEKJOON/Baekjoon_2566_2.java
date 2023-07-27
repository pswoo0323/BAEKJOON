package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_2566_2 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int arr[][] = new int[9][9];
        int max = 0;
        int row = 0; //행
        int col = 0; //열

        for (int i = 0; i < 9; i++) {
            st = new StringTokenizer(br.readLine());//br.readLine()의 return은 String이므로 String으로 입력을 받아야한다.
            for (int j = 0; j <9 ; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                if(arr[i][j] > max){
                    max = arr[i][j];// arr[i][j] = max 하면 왜틀림??
                    row = i + 1;
                    col = j + 1;
                }
                else if(max==0){
                    row =1;
                    col =1;
                }
            }
        }
        System.out.println(max);
        System.out.println(row + " " +col);
        br.close();
    }
}
