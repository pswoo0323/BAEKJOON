package BAEKJOON;
//너의 평점은 **
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_25206_Buffer {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double totalscore = 0;
        double sumnum = 0;

        for (int i = 0; i < 20; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            String subject = st.nextToken();
            double score = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();
            double s = 0.0;

                switch (grade) {
                    case "A+":
                        s = 4.5;
                        break;
                    case "A0":
                        s = 4.0;
                        break;
                    case "B+":
                        s = 3.5;
                        break;
                    case "B0":
                        s = 3.0;
                        break;
                    case "C+":
                        s = 2.5;
                        break;
                    case "C0":
                        s = 2.0;
                        break;
                    case "D+":
                        s = 1.5;
                        break;
                    case "D0":
                        s = 1.0;
                        break;
                    case "F":
                        s = 0.0;
                        break;
                    case "P":
                        s = 0.0; score=0;
                        break;
                }
                totalscore += s * score;
                sumnum = sumnum + score;
            }
        System.out.println(totalscore / sumnum);
        }
    }
