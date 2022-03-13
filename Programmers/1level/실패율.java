public class 실패율 {
    public int[] solution(int N, int[] stages) {
        // N 단계 스테이지까지 있고 , 현재 멈춰있는 스테이지의 번호가 담긴 배열
        // 실패율이 높은 스테이지 부터 내림차순으로 리턴
        int[] answer = new int[N]; // 정답
        double[] fail = new double[N+1]; // 실패율
        int cnt = 0;
        
        for (int data:stages
             ) {
            if (data >= N+1) fail[N]++;
            else fail[data-1]++;
        }

        for (int i = 0; i < N+1; i++){
            cnt = 0;
            for (int j = i; j < N+1; j++){
                cnt += fail[j];
            }
            if(fail[i]==0) fail[i] = 0;
            else fail[i] = fail[i]/cnt; // 실패율 구하기
        }
        // 현재 실패율이 fail[0] 부터 fail[N] 까지 들어가있다.
        // 1스테이지부터 N스테이지 까지는 fail[0] - fail[N-1] 이다.
        for (int i = 0; i < N; i++){
            int index = -1;
            double max = -1;
            for (int j = N-1 ; j > -1; j--){
                if(fail[j] >= max){
                    max = fail[j];
                    index = j; // 저장
                }
            }
            if (index != -1){
                fail[index] = -2;
                answer[i] = index+1;
            }
        }

        return answer;
    }
}
