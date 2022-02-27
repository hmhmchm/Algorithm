import java.util.Arrays;

public class 예산 {
    public int solution(int[] d, int budget) {
        int answer = 0, cnt = 0;
        Arrays.sort(d); // 일단 오름차순 정렬
        for (int i = 0; i < d.length ; i ++){
            answer += d[i];
            cnt++;
            if(answer > budget){
                cnt-= 1;
                break;
            }
        }
        return cnt;
    }
}
