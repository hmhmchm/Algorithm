import java.util.HashSet;
import java.util.Set;

public class 폰켓몬 {
    public int solution(int[] nums) {
        int answer = 0;
        int num = nums.length / 2; // 배열 절반 크기
        Set<Integer> set = new HashSet<>();

        for (int data : nums
        ) {
            set.add(data);
        }

        if (set.size() >= num) answer = num;
        else answer = set.size();

        return answer;
    }
}
