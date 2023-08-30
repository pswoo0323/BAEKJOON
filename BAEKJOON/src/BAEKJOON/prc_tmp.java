package BAEKJOON;

import java.util.Arrays;

public class prc_tmp {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,7,8,9};
        System.out.println(arr);
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i <7 ; i++) {//100번 값 바꾸기
            int n = (int)(Math.random()*10);
            int tmp = arr[0];//arr[o]의 값을 변수 tmp 에 저장
            arr[0] = arr[n];//arr[n]의 값을 arr[0]에 저장
            arr[n] = tmp;//tmp 값을 arr[n]에 저장

//            for (int i = 0; i <1 ; i++) {//100번 값 바꾸기
//                int n = 3;//(int)(Math.random()*10);
//                int tmp = arr[0];//arr[o]의 값을 변수 tmp 에 저장
//                arr[0] = arr[3];//arr[n]의 값을 arr[0]에 저장
//                arr[3] = tmp;//tmp 값을 arr[n]에 저장
            System.out.println(Arrays.toString(arr));
        }

    }
}
