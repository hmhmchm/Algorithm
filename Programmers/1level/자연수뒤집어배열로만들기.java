import java.util.ArrayList;

public class 자연수뒤집어배열로만들기 {
    public int[] solution(long n) {
        ArrayList<Long> list = new ArrayList<>();
        long tmp = n;
        while(tmp > 0){
            long a = tmp % 10;
            list.add(a);
            tmp /= 10;
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++){
            answer[i] = list.get(i).intValue();
        }
        return answer;
    }
}
