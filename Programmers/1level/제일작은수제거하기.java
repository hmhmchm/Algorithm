import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 제일작은수제거하기 {
    public int[] solution(int[] arr) {
        if(arr.length == 1) {
            arr[0] = -1; return arr;
        }

        int[] answer = new int[arr.length-1];
        int[] arr2 = arr.clone(); // arr2에 똑같이 복제

        List<Integer> list = new ArrayList<Integer>();

        Arrays.sort(arr2); // 오름차순으로 정리

        // 오름차순으로 정리했으니 제일 왼쪽의 수와 같지 않을 조건에만 list에 담기
        for (int i = 0; i < arr2.length; i++){
            if(arr[i] != arr2[0]) list.add(arr[i]);
        }
        // answer 배열에 내보내기
        for (int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }

        return answer;
    }
}
