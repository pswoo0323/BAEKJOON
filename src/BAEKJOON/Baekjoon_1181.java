package BAEKJOON;

import java.util.Arrays;
import java.util.Comparator;//compare 메소드는 양의정수,0,음의정수 총 3가지 리턴 값이 있다.
import java.util.Scanner;
//정렬문제
public class Baekjoon_1181 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] arr = new String[n];

        //개행버림
        sc.nextLine();

        for(int i=0; i<n; i++){
            arr[i]=sc.nextLine();
        }

        Arrays.sort(arr,new Comparator<String>() {
            public int compare(String s1, String s2){
                //단어가 같을 경우
                if (s1.length()==s2.length()) {
                    return s1.compareTo(s2);//사전 순 정렬, compareTo : 두개의 값을 비교하여 int값으로 봔환해주는 함수
                }
                else{
                    return s1.length() - s2.length();
                }
            }
        });
        //미리 첫 번째 값을 출력
        System.out.println(arr[0]);
        //i-1 즉 0-1=-1 이 되니깐 조건문이 돌아가지 않음
        //그래서 1-1 해주기 위해 미리 0의 위치 출력

        //중족되지 않는 단어만 출력
        for(int i=1; i<n; i++){
            if(!arr[i].equals(arr[i-1])){
                System.out.println(arr[i]);
            }
        }
    }
}

