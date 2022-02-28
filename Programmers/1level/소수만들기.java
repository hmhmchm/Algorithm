import java.util.ArrayList;

public class 소수만들기 {
    public int solution(int[] nums) {
        int answer = 0;
        int sum = 0;
        ArrayList<Integer> list = new ArrayList<>(); // 세개 수의 합을 담을 리스트
        for (int a = 0; a < nums.length; a++) {
            for (int b = a + 1; b < nums.length; b++) {
                for (int c = b + 1; c < nums.length; c++) {
                    sum = nums[a] + nums[b] + nums[c];
                    if (isPrime(sum)) answer++;
                }
            }
        }
        return answer;
    }
    public static boolean isPrime(int n) {
        boolean istrue = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) { // 소수가 아닐 때
                istrue = false;
                break;
            }
        }
        return istrue;
    }
}
