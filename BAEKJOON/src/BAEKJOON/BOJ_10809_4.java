package BAEKJOON;
//알파벳 찾기
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10809_4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int arr[] = new int[26];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = -1;//배열 -1로 초기화
        }
        String str = br.readLine();//단어 입력받기
        for (int i = 0; i < str.length(); i++) {
            int n = str.charAt(i)-'a';
            // 단어의 문자값에 해당하는 인코딩값을 -97 또는 -'a' 하여 알파벳 소문자 a가 0, z 가 25로 인덱스를 맞춰준다.
            if (arr[n] == -1) {// 만약 인덱스에 해당하는 배열위치가 -1인지 확인한다.
                arr[n] = i;// -1이 맞다면 처음 등장한 알파벳이므로 위치값을 저장한다.
            }  // -1이 아니라면 이미 등장한 알파벳이므로 넘어간다.

        }
        //단어 출력
        for (int i = 0; i < 26; i++) {
        sb.append(arr[i]).append(" ");
        }
        System.out.println(sb);
    }
}
