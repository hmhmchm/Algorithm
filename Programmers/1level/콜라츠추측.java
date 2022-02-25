public class 콜라츠추측 {
    public int solution(long num) {
        // 입력받은 num 을 long 으로 타입을 바꿔줘야한다.
        int cnt = 0;
        while(num != 1){
            if(num % 2 == 0) num /= 2;
            else num = num * 3 + 1;
            cnt ++;
            if(cnt == 500){
                return -1;
            }
        }
        return cnt;
    }
}
