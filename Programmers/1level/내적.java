public class 내적 {
    public int solution(int[] a, int[] b) {
        // a 배열과 b 배열의 내적을 구하라.
        int answer = 0;

        for (int i = 0; i < a.length ; i++){
            answer += a[i] * b[i];
        }
        return answer;
    }
}
