public class 삼진법뒤집기 {
    public int solution(int n) {
        String answer = "";
        while(n >= 3){
            answer += n % 3;
            n /= 3;
        }
        answer += n;

        return Integer.parseInt(answer,3); // string -> int 3진법으로
    }
}
