import java.util.Scanner;

public class 일이삼더하기 {
    static int N;
    static int[] nums;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        nums = new int[N];
        for (int i = 0; i < N ; i++){
            nums[i] = sc.nextInt();
        }
        combination(0,0);
    }

    public static void combination(int start, int cnt){
        // 종료조건

        // 포문

    }
}
