package src.Level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class p1193 {
    //대각선 칸의 개수는 T-1개이다.
    //T % 2 == 0일떄는 대각선 위방향, 1이때는 아래 방향으로 진행된다.
    /*
    * 입력받을  x값
    * 해당 범위의 대각선 칸의 개수 (cross_count)
    * 해당 대각선 직전 대각선 까지의 칸의 누적 합(prev_count_sum)
    * */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());

        int cross_count = 1, pre_count_sum=0;
        while(true){
            //직전 대각선 누적합 + 해당 대각선 개수 이용한 범위 판별
            if(a <= pre_count_sum + cross_count) {
                if(cross_count % 2== 1){ //대각선의 개수가 홀수라면
                    // 분자가 큰 수부터 시작
                    // 분자는 대각선상 블럭의 개수 - (x번째 -  직전 대각선까지의 블럭개수 -1)

                }
            }
        }
    }
}
