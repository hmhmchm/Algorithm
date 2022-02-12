public class 자릿수더하기 {
    public int solution(int n) {
        // 자릿수 합을 구해라
        int answer = 0;

        while(n >0){
            answer += n%10;
            n/=10;
        }
        return answer;
    }
}
