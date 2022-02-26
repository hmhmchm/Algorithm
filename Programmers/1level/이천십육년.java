public class 이천십육년 {
    public String solution(int a, int b) {
        String[] str = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int[] arr = {31,29,31,30,31,30,31,31,30,31,30,31};

        for (int i = 1; i < a; i++){
            b += arr[i-1]; // 원래 일 수에다가 앞 달의 일수들을 모두 더한다.
        }
        // 2016년 1월 1일은 금요일부터 시작이다.
        return str[(b-1)%7];
    }
}
