package BAEKJOON;

import java.util.Scanner;
import java.io.IOException;

public class _10811_2 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[sc.nextInt()];
        for(int i=0; i<arr.length; i++){
            arr[i] = i+1;
        }
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            int move1 = sc.nextInt()-1;
            int move2 = sc.nextInt()-1;

            while(move1<move2){
                int temp = arr[move1];
                arr[move1++] = arr[move2];
                arr[move2--] = temp;
            }
        }
        String ret = "";
        for (int j=0; j<arr.length; j++){
            ret = ret+arr[j] + " ";
        }
        System.out.println(ret);
        sc.close();
    }
}
