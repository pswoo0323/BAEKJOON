package BAEKJOON;

import java.util.Scanner;

public class Baekjoon_1676_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.next());
        int count2 = 0;
        int count5 = 0;

        //factorial 진행과정 중에서 2와 5의 곱의 개수를 파악한다.
        for(int i=1; i<=n; i++){
            int object = i;

            //소인수 분해하며 2의 개수를 파악
            while(object % 2 ==0){
                count2++;
                object = object /2 ;
            }
            //소인수 분해하며 5의 개수를 파악
            while(object % 5 ==0){
                count5++;
                object = object / 5 ;
            }
        }
        System.out.println(Math.min(count2,count5));
    }
}
