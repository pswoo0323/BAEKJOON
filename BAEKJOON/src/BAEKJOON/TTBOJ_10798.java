package BAEKJOON;
//세로읽기
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TTBOJ_10798 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//두개의 보조 스트림 BufferedReader, InputStreamReader를 사용해서 입력 객체를 생성해준다
        
         char arr [][] = new char[5][15];//세로5 가로15
        for (int i = 0; i < arr.length; i++) {
            String str = br.readLine();//문자열을 5 번 입력 받고
            for (int j = 0; j < str.length(); j++) {
                arr[i][j] = str.charAt(j);//입력받은 문자열의 한문자 한문자 배열에 순서대로 넣어줌
            }
        }
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                if(arr[j][i]==' ' || arr[j][i]=='\0')//<-왜 null 은 안됨??
                    continue;
                System.out.print(arr[j][i]);
            }
        }
    }
}
