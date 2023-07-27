package BAEKJOON;
//평균
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_1546_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());//시험본 과목의 개수
        double max = 0;//최대값 초기화
        double sum = 0;
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");//40 80 60 칸 나누기 위해
        double arr[] = new double[N];//배열 개수 N개
        for (int i = 0; i < arr.length; i++) {
            int score = Integer.parseInt(st.nextToken());//성적 입력값
            max = Math.max(max, score);//시험점수 최댓값 구하기
            sum = sum + score;//시험 점수 합에 더해주기
        }
        sum = sum / max;//과목점수/최고점 * 100 을 이렇게 식을 나눠서 계산할 수 있음.
        sum = sum * 100;
        sum = sum / N;
        System.out.println(sum);

    }
}