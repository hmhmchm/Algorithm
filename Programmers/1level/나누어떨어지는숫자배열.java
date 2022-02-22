import java.util.ArrayList;
import java.util.Collections;

public class 나누어떨어지는숫자배열 {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++){
            if(arr[i] % divisor == 0) list.add(arr[i]);
        }
        if(list.isEmpty()) return new int[]{-1};
        int[] answer = new int[list.size()];
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}
