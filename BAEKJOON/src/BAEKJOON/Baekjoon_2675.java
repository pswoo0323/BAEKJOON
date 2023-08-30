package BAEKJOON;
import java.util.Scanner;
public class Baekjoon_2675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr [] = new int [N];
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = sc.nextInt();
        }
        long sum = 0;
        long max = 0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]>max) max = arr[i];
            sum = sum + arr[i];
        }
        System.out.println(sum * 100.0 / max / N);
    }
}
