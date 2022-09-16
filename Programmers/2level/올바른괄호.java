import java.util.Stack;

public class 올바른괄호 {
    public static void main(String[] args) {
        boolean answer = false;
//        Stack<Integer> stack = new Stack<>();
        String s= "()()";
//        String s= "(())()";
//        String s= ")()(";
//        String s= "(()(";
        int cnt = 0;

        for (int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(') cnt ++;
            else cnt--;

            if(cnt < 0) {
                break;
            }
        }
        if(cnt == 0) answer = true;
        System.out.println(answer);
    }
}
