import java.util.HashMap;
class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        
        HashMap<String,Integer> map = new HashMap<>();
        
        for(String[] item : clothes){
            String type = item[1];
            map.put(type, map.getOrDefault(type,0) + 1);
        }
        
        // 각 의상별로 조합
        // int combi = 1;
        for(int count : map.values()){
            answer *= (count + 1);
        }
        
        return answer-1;
    }
}
