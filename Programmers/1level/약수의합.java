public class 약수의합 {
    public int solution(int n) {
        // n의 약수를 더한 값을 구하라.
        int answer = 0;
        for (int i = 1; i <= n; i++){
            if(n % i ==0) answer +=i;
        }
        return answer;
    }
}
