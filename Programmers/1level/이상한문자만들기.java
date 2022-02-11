public class 이상한문자만들기 {
    public String solution(String s) {
        //짝수 번째 알파벳은 대문자로   홀수를 소문자로 리턴하라.
        //공백도 인덱스로 인식하라.
        // aa bb
        // a bb
        // ao  cd
        String answer = "";
        String[] str = s.split("");
        int cnt = 0;

        for (int i = 0; i < str.length; i++){
            if(str[i].equals(" ")) cnt =0;
            else{
                if(cnt%2 ==0) {
                    cnt ++;
                    str[i] = str[i].toUpperCase(); // 짝수  대문자로바꾸기.
                }
                else {
                    cnt ++;
                    str[i] = str[i].toLowerCase(); // 홀수 소문자로 바꾸기.
                }
            }

            answer += str[i];
        }

        return answer;
    }
}
