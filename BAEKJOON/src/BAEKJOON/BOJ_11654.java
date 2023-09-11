package BAEKJOON;
//아스키 코드
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_11654 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String str = br.readLine(); //입력받기
//        char c = str.charAt(0);//글자를 char 형으로 변환
//        System.out.println((int)c);//char형에서 int형으로 변환 후 출력
        int s = br.readLine().charAt(0);
        System.out.println(s);
    }
}
