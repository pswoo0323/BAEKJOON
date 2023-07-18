package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Baekjoon_2566 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int arr [][] = new int [9][9];
        int max = 0;
        int hang = 0;
        int yeol = 0;

        for (int i = 1; i <=9 ; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <=9 ; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                if(arr[i][j]>max){
                    max = arr[i][j];
                }
            }
        }
    }
}
