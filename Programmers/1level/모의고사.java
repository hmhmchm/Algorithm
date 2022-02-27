import java.util.ArrayList;

public class 모의고사 {
    public int[] solution(int[] answers) {
        // 1번 12345 2번 21 23 24 25 반복 3번 33 11 22 44 55 반복
        int[][] arr = {
                {1,2,3,4,5},
                {2,1,2,3,2,4,2,5},
                {3,3,1,1,2,2,4,4,5,5}
        };
        int[] people = new int[3];

        for (int i = 0; i < people.length; i++){
            for (int j = 0; j < answers.length; j++){
                if(arr[i][j % arr[i].length] == answers[j]) people[j]++;
            }
        }

        int max = Math.max(Math.max(people[0],people[1]),people[2]);

        ArrayList<Integer> list = new ArrayList<>();

        if(max == people[0]) list.add(1);
        if(max == people[1]) list.add(2);
        if(max == people[2]) list.add(3);

        int[] answer = new int[list.size()];
        int idx = 0;
        for (int data: list
             ) {
            answers[idx] = data;
            idx++;
        }

        return answer;
    }
}
