package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       int[] iarr = {100,95,80,70,60};
        System.out.println(Arrays.toString(iarr));
        for (int i = 0; i <iarr.length ; i++) {
            System.out.println(i);

        }
    }
}