package BAEKJOON;
//알파벳 찾기
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10809_3 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int arr[] = new int[26];
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = -1;
        }
        for (int i = 0; i <str.length() ; i++) {
            char ch = str.charAt(i);

            if(arr[ch-97] == -1){//arr 배열의 인덱스(원소 위치)는 ch 가 갖고 있는 문자 인코딩 값(=아스키코드 값과 동일)에 'a' 또는 97 을 빼주면 된다.
                arr[ch-97] = i;//( a 는 10진수로 97 이라는 값에 대응된다.)
            }
        }//만약 b 라는 문자가 ch 에 담겨있을 경우 b - 'a' 또는 b - 97 을 하면 1 이 되고, arr[1] 은 문자 b를 가리키는 것을 의미한다.
        for(int answer : arr){
            System.out.print(answer + " ");
        }
    }
}
/*
int ar[] = {1,2,3};
for (int val : arr) {
sout(val);}
for( 배열의 요소값 : 반복대상 배열명)
int val 에 1, 2, 3이 순차적으로 담기며 출력된다.
배열의 길이만큼 자동으로 반복한다!
 */