package BAEKJOON;

import java.util.Scanner;
//선택정렬(selection sort)
public class BOJ_2750_selectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int arr[] = new int[N];

        for(int i = 0; i<N; i++){
            arr[i] = sc.nextInt();
        }
        //Selection Sort
        for(int i=0; i<N-1; i++){
            for(int j= i+1; j<N; j++){
                if(arr[i] > arr[j]){//>면 오름차순 <이면 내림차순
                    int temp = arr[j];//값을 변경해야하기 때문에 임시저장
                    arr[j] = arr[i];//i를 j로 변경
                    arr[i] = temp;//j를 i로 변경
                }
            }
        }
        for(int val : arr){
            System.out.println(val);
        }
    }
}
