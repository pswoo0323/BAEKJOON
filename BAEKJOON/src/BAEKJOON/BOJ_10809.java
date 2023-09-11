package BAEKJOON;
import java.util.Scanner;
public class BOJ_10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[26];//a~z =0~25 =>26개
        for (int i = 0; i < 26; i++) {
            arr[i] = -1;//모든 배열의 수를 -1로 초기화
            //(알파벳이 등장하지 않으면 -1로 출력하면 되므로.)
        }
        String input = sc.nextLine();
        for (int i = 0; i < input.length(); i++) {//
            char c = input.charAt(i);
            if (arr[(int) c - 97] == -1) {//아스키 코드 이용
                arr[(int) c - 97] = i;//a의 아스키코드값은 97이므로 -97을 하게되면 a는 인덱스 0을 가지게 된다.

            }
        }
        for (int i = 0; i < 26; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
//https://jumping-to-the-water.tistory.com/47 참조