public class 신규아이디추천 {
    public String solution(String new_id) {
        String answer = "";
        String str = "";
        String dot = ".";
        int num = 0;
        new_id = new_id.toLowerCase();
        // 1단계 대문자를 소문자로 변환, 2단계 사용할수 있는 문자만 사용
        for (int i = 0; i < new_id.length(); i++){
            char c = new_id.charAt(i);
            if(Character.isLowerCase(c)||Character.isDigit(c)||
            c =='-'||c=='_'||c=='.'){
                str = String.valueOf(c);
                answer += str;
            }
        }
        // 3단계 마침표가 2번 이상 연속된부분을 하나의 마침표로 나타냄.
        for (int i = 0; i < answer.length(); i++){
            if(answer.charAt(i) == '.'){
                num = i + 1;
                while (num != answer.length() && answer.charAt(num) =='.'){
                    dot += '.';
                    num++;
                }
                if(dot.length()>1) answer = answer.replace(dot,".");
            }
        }
        // 4단계 . 마침표가 처음과 끝에 있으면 제거
        if(answer.startsWith(".")) {
            answer = answer.substring(1,answer.length());
        }else if(answer.endsWith(".")){
            answer = answer.substring(0,answer.length()-1);
        }
        //5단계 빈문자열이라면
        if(answer.length() == 0){
            answer += "a";
        }
        // 6단계 길이가 16자 이싱이면 15자만 남기고 다 제거, 7단계 2자 이하이면
        if(answer.length() > 15){
            answer = answer.substring(0,15);
        }
        if(answer.endsWith(".")){
            answer = answer.substring(0,answer.length()-1);
        }

        String str2 = answer.charAt(answer.length()-1) + "";
        if(answer.length() == 2){
            answer += str2;
        }else if(answer.length() == 1){
            answer += str2 + str2;
        }

        return answer;
    }
}
