package BAEKJOON;
import java.util.Scanner;
//블루트포스(완전탐색 문제)
public class BaekJoon_7568 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();//전체 사람의 수
        int weight[] = new int[N];//몸무게
        int height[] = new int[N];//키
        int rank[] = new int[N];//등수

        for(int i=0; i<N; i++){//입력받기
            weight[i] = sc.nextInt();
            height[i] = sc.nextInt();
        }
        for(int i=0; i<N; i++){//등수 주인공
             int count =1;
             for(int j=0; j<N; j++){//비교군
                 if(i==j) continue;//본인과 비교X

                 if(weight[i]<weight[j] && height[i]<height[j]){
                     count = count +1;//덩치가 나보다 크면 +1
                 }
             }
             rank[i] = count; //값 저장
            count = 1;
        }
        for (int i=0; i<N; i++){
            System.out.print(rank[i] + " ");
        }
    }
}
