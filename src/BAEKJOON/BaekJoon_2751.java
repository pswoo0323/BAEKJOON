package BAEKJOON;
/*Tim Sort
Merge Sort(합병 정렬), Insertion Sort(삽입 정렬)이 혼용 된하이브리드
정렬 알고리즘이다. 좀 더 자세하게 말하자면, 합병정렬을 기반으로 구현하되,
일정 크기 이하의 부분 리스트에 대해서는 이진 삽입 정렬을 수행하는 것이다.
 */
//Scanner + Collection.sort
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class BaekJoon_2751 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        Stringbuilder는 String과 문자열을 더할 때 새로운 객체를 생성
        하는것이 아니라 기존의 데이터에 더하는 방식을 사용하기 때문에 속도도 빠르며
        상대적으로 부하가 적다.
         */
        StringBuilder sb = new StringBuilder();

        int N =sc.nextInt();
        //list 계열 중 하나를 쓰면 된다.
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i<N; i++){
            list.add(sc.nextInt());
        }
        Collections.sort(list);

        for(int value : list){
            sb.append(value).append('\n');
        }
        System.out.println(sb);
    }
}
