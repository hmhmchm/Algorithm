package samsung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 제로 {
    static int N;
    static int tmp; // 담을 숫자
    static int sum; // 남은 숫자 합
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        N = Integer.parseInt(in.readLine());

        for (int i = 0; i < N; i++){
            tmp = Integer.parseInt(in.readLine());
            if(tmp == 0){
                stack.pop();
            }else{
                stack.push(tmp);
            }
        }

        for (int data: stack
             ) {
            sum += data;
        }
        System.out.println(sum);
    }
}
