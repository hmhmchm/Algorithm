import java.util.Scanner;
import java.util.Stack;

public class 막대기 {
    static int N;
    static int num,tmp = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        N = sc.nextInt();
        int cnt = 1;

        for (int i = 0; i < N; i++){
            num = sc.nextInt();
            stack.push(num);
        }
        tmp = stack.pop();
        while (!stack.isEmpty()){
            num = stack.pop();
            if(tmp < num){
                tmp = num;
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
