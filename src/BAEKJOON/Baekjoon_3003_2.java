package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_3003_2 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int King = 1;//고정된 수 정의해놓기
        int Queen = 1;
        int Rook = 2;
        int Bishop = 2;
        int Night = 2;
        int Pawn = 8;

        StringTokenizer st = new StringTokenizer(br.readLine()," ");//입력 공백 나눠서 받기
        King = King - Integer.parseInt(st.nextToken());
        Queen = Queen - Integer.parseInt(st.nextToken());
        Rook = Rook - Integer.parseInt(st.nextToken());
        Bishop = Bishop - Integer.parseInt(st.nextToken());
        Night = Night - Integer.parseInt(st.nextToken());
        Pawn = Pawn - Integer.parseInt(st.nextToken());

        System.out.print(King + " ");
        System.out.print(Queen + " ");
        System.out.print(Rook + " ");
        System.out.print(Bishop + " ");
        System.out.print(Night + " ");
        System.out.print(Pawn + " ");
    }
}
