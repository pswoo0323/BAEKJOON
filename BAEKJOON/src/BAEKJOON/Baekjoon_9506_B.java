package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Baekjoon_9506_B {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();


        while (true) {
            int N = Integer.parseInt(br.readLine());
            if (N == -1) break;

            ArrayList<Integer> list = new ArrayList<>();
            int sum = 0;
            for (int i = 1; i < N; i++) {
                if (N % i == 0) {
                    list.add(i);
                    sum = sum + i;
                }
            }
            sb.append(N);
            if (N == sum) {
                sb.append(" = ");
                for (int i = 0; i < list.size() - 1; i++)
                    sb.append(list.get(i) + " + ");
                sb.append(list.get(list.size() - 1));
                //sb.append("\n");
            } else
                sb.append(" is NOT perfect.");
            sb.append("\n");
        }
        System.out.println(sb);
    }
}

