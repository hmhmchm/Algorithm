public class 두정수의합 {
    public long solution(int a, int b) {
        long answer = 0;
        long max = Math.max(a,b);
        long min = Math.min(a,b);

        for (long i = min; i <= max; i++){
            answer += i;
        }

        return answer;
    }
}
