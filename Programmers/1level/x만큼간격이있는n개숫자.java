public class x만큼간격이있는n개숫자 {
    public long[] solution(int x, int n) {
        //정수 x와 n을 입력받아, x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴
        long[] answer = new long[n];
        long y = x; // 자료형 int가 아니라 long으로 해야한다.
        for (int i = 0; i < answer.length; i++) {
            answer[i] = y;
            y += x;
        }
        return answer;
    }
}
