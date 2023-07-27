import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_1157_B {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int arr[] = new int[26];//알파벳 갯수 만큼 배열 만들기
        String str = br.readLine();//입력값(문자열) 받기

        for (int i = 0; i <str.length() ; i++) {//문자열 길이 만큼 반복문
            if (65<=str.charAt(i)&& str.charAt(i)<=90){//65(대문자'A')보다 크고90('Z')보다 작으면 대문자(i)++;
                arr[str.charAt(i)- 65]++;
            }
            else if(97<=str.charAt(i)&&str.charAt(i)<=122){
                arr[str.charAt(i)-97]++;
            }
        }
        int max = 0;
        char c = '?';
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] > max){
                max = arr[i];
                c = (char)(i+65);
            }
            else if (arr[i] ==max){
                c = '?';
            }
        }
        System.out.println(c);
    }
}