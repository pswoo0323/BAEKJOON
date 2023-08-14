package BAEKJOON;
import java.util.Scanner;
public class Baekjoon_1018 {
    public static boolean[][] arr;
    public static int min = 64;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int M = in.nextInt();

        arr = new boolean[N][M];
        //배열
        for(int i=0; i<N; i++){
            String str = in.next();

            for(int j=0; j<M; j++){
                if(str.charAt(j)=='w'){
                    arr[i][j] = true;
                } else{
                    arr[i][j] = false;
                }
            }
        }

        int N_row = N-7;
        int M_col = M-7;

        for(int i=0; i<N_row; i++){
            for(int j=0; j< M_col; j++){
                find(i,j);
            }
        }
        System.out.println(min);
    }
    public static void find(int x, int y){
        int end_x = x+8;
        int end_y = y+8;
        int count = 0;

        boolean TF = arr[x][y];

        for(int i = x; i<end_x; i++){
            for(int j=y; j<end_y; j++){
                //옳바른 색이 아닐경이 count 1증가
                if(arr[i][j] != TF){
                    count++;
                }
              TF = (!TF);
            }
            TF = !TF;
        }
        count = Math.min(count, 64-count);
        min = Math.min(min,count);
    }
}
