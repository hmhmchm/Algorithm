public class 하샤드수 {
    public boolean solution(int x) {
//        양의 정수 x가 하샤두 수이려면 x의 자릿수 합으로 x가 나누어 져야한다.
//        자연수 x가 하샤드 수인지 아닌지 판별하는 함수 만들어라.
        boolean answer = true;
        int tmp = 0; // 담을 합의 수
        int tmp1 = x;
        while (x > 0){
            tmp += x % 10;
            x = x / 10;
        }
        x = tmp1;
        if(x % tmp == 0)answer = true;
        else answer = false;

        return answer;
    }
}
