package BAEKJOON;

import java.util.Scanner;
//수학 연산자 사용
public class BOJ_2908 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int input2 =sc.nextInt();
        input =(input % 10) * 100 + ((input % 100)/10)*10 + (input / 100);
        input2 =(input2 % 10) * 100 + ((input2 % 100)/10)*10 + (input2 / 100);
        if(input>input2){
            System.out.println(input);
        }
        else{
            System.out.println(input2);
        }
    }
}
