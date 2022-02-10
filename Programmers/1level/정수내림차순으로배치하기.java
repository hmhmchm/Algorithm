import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 정수내림차순으로배치하기 {
    public long solution(long n) {
        String answer = "";
        List<Long> arr = new ArrayList<>();

        while(n > 0){
            arr.add(n % 10);
            n/=10;
        }

        Collections.sort(arr, Collections.reverseOrder()); //내림차순
        for (long data:
             arr) {
            answer += String.valueOf(data);
        }

        return Long.parseLong(answer);
    }
}
