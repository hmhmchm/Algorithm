public class 문자열내p와y의개수 {
    boolean solution(String s) {
        // 문자열 내 p와 y의 개수 같으면 true, 다르면 false
        boolean answer = true;
        int p = 0, y = 0;

        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++){
            if(arr[i] == 'p' || arr[i] == 'P') p++;
            else if(arr[i] == 'y'|| arr[i] == 'Y') y++;
        }
        if(p==0 && y==0) answer = true;
        else if(p == y) answer = true;
        else answer = false;

        return answer;
    }
}
