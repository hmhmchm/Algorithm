public class 소수찾기 {
    public int solution(int n) {
        int answer = 0;
        boolean visited[] = new boolean[n+1];
        for (int i = 2; i <= n; i++){
            if(visited[i]) continue; // 방문 했으면 지나가고

            for (int j = i+i; j <= n; j += i){ // n까지 돌리면서 자기자신을 제외하고 배수들을 true로 만들어준다.
                visited[j] = true;
            }
        }
        for (int i = 2; i <= n; i++){
            if(visited[i] == false) answer++;
        }
        return answer;
    }
}
