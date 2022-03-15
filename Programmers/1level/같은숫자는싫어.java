import java.util.ArrayList;

public class 같은숫자는싫어 {
    public int[] solution(int []arr) {
        int[] answer = {};
        //tewst
        ArrayList<Integer> list = new ArrayList<>();
        int tmp = 11;

        for (int i =  0;  i < arr.length; i++){
            if(arr[i] != tmp) list.add(arr[i]);
            tmp = arr[i];
        }
        answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++){
            answer[i] = list.get(i);
        }

        return answer;
    }
}
