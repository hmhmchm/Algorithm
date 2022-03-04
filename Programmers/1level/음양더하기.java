public class 음양더하기 {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        int[] arr = new int[signs.length];
        for (int i = 0; i < signs.length; i++){
            if(signs[i] == true){
                arr[i] = 1;
            }else if(signs[i] == false) arr[i] = -1;
        }
        for (int i = 0; i < absolutes.length; i++){
            answer += absolutes[i] * arr[i];
        }
        return answer;
    }
}
