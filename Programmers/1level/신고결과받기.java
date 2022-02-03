import java.util.HashMap;
import java.util.Map;

class 신고결과받기 {
    public int[] solution(String[] id_list, String[] report, int k) {
        // 이용자 ID , 이용자가 신고한 ID, 정지 기준
        // 각 유저별로 처리 결과 메일을 받은 횟수를 배열에 담아 return
        Map<String , String> map = new HashMap<>();
        for (int i = 0; i < id_list.length; i++){
            map.put(id_list[i] , report[i]); // 잘못되었음
        }

        int[] answer = {};
        
        return answer;
    }
}
