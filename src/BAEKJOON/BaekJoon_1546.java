package BAEKJOON;

import java.util.Scanner;

public class BaekJoon_1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();//변수 N에 과목수 입력받기
        int arr[] = new int[N];//길이가 N인 배열 arr[] 선언하기

        for(int i =0; i<N; i++){ //for(N의 크기만큼)
            arr[i] = sc.nextInt();//arr[i]에 점수 입력받기
        }
        long sum = 0;//총합을 지정할 변수 sum 초기화 선언
        long max = 0;//최고 점수를 저장할 변수 max 초기화 선언

        for(int i=0; i<N; i++){//for(N의 크기만큼)
            if(max<arr[i])
                max = arr[i];//if문으로 최고점수 구해서 max에 저장
                sum = sum+arr[i];//모든 점수의 총합을 sum에 저장
            }
            System.out.println(sum * 100.0 / max / N);
        }
    }

