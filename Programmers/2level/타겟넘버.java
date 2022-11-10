import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 타겟넘버 {
    static int answer = 0;

    public static void main(String[] args) {
        int[] numbers = {1,1,1,1,1};
        int target = 3;

        dfs(0,0,numbers,target);
        System.out.println(answer);
    }

    public static void dfs(int n,int sum, int[] numbers, int target) {
        // 1. 종료 조건
        if(n == numbers.length){
            if(sum == target){
                answer++;
            }
            return;
        }
        // 2. 수행 동작
        dfs(n+1,sum+numbers[n], numbers , target);
        dfs(n+1,sum-numbers[n], numbers , target);
    }
}
