package BAEKJOON;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//나이순 정렬
//정렬 알고리즘
public class BOJ_10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int Number = Integer.parseInt(br.readLine());//문자열을 기본형 정수로 리턴한다.
        //입력되는 나이의 범위 1~200 , 인덱스는 항상 0부터 =>201
        StringBuilder arr[] = new StringBuilder[201];//

        //객체배열의 인덱스에 각 StringBuilder 객체를 생성해준다.
        for(int i=0; i<arr.length; i++){
            arr[i] = new StringBuilder();
        }
        for(int i=0; i<Number; i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            //카운팅 정렬 : 나이를 index 로 하여 해당 배열의 나이와 이름을 append() 한다
            arr[age].append(age).append(' ').append(name).append('\n');
        }
        StringBuilder sb = new StringBuilder();
        for(StringBuilder val:arr){
            sb.append(val);
        }
        System.out.println(sb);
    }
}