import java.util.ArrayList;
import java.util.Collections;

public class k번째수 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < commands.length; i++) {
            for (int a = commands[i][0]-1; a < commands[i][1]; a++) {
                list.add(array[a]);
            }
            Collections.sort(list); // 정렬
            answer[i] = list.get(commands[i][2]-1);
            // 남은 list 삭제
            while (!list.isEmpty()){
                list.remove(0);
            }
        }
        return answer;
    }
}
