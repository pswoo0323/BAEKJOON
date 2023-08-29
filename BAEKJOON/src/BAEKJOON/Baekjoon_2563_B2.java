package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_2563_B2 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[][]arr = new int[100][100];
        int count = 0;

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int X = Integer.parseInt(st.nextToken());
            int Y = Integer.parseInt(st.nextToken());

            for (int j = X; j < X+10; j++) {
                for (int k = Y; k < Y+10; k++) arr[j][k] = 1;
                }
            }
            for (int j = 0; j <100 ; j++) {
                for (int k = 0; k <100 ; k++) {
                    if (arr[j][k] ==1)
                        count++;
            }
        }
        System.out.println(count);
    }
}
