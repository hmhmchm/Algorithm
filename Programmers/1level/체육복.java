import java.util.Arrays;

public class 체육복 {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        boolean[] tmp = new boolean[n]; // true로 시작.
        boolean[] r_visited = new boolean[reserve.length];
        boolean[] l_visited = new boolean[lost.length];

        Arrays.sort(lost);
        Arrays.sort(reserve);
        // true로 시작.
        for (int i = 0; i < n ; i++){
            tmp[i] = true;
        }
        for (int i = 0; i < lost.length; i++){
            tmp[lost[i]-1] = false;
        }
        for (int i = 0; i < reserve.length; i++){
            for (int j = 0; j < lost.length; j++){
                if(reserve[i] == lost[j]){
                    tmp[lost[j]-1] = true;
                    r_visited[i] = true;
                    l_visited[j] = true;
                }
            }
        }
        for (int i = 0; i < reserve.length; i++){
            for (int j = 0; j < lost.length; j++){
                if(!r_visited[i] && !l_visited[j]){
                    if(reserve[i]-1 == lost[j] || reserve[i]+1 == lost[j]){
                        tmp[lost[j]-1] = true;
                        r_visited[i] = true;
                        l_visited[j] = true;
                    }
                }
            }
        }

        for (int i = 0; i < n; i++){
            if(tmp[i]) answer++;
        }
        return answer;
    }
}
