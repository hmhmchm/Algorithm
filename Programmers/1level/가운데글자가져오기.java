public class 가운데글자가져오기 {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split("");
        int idx = str.length / 2;
        // 길이가 짝수 일 때는 2로나눈수와 거기에 1을 뺀 수, 홀수 일떄는 2로 나눈 수
        if(str.length % 2 == 0) answer = str[idx-1] + str[idx];
        else answer = str[idx];
        return answer;
    }
}
