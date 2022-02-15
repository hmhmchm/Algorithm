public class 시저암호 {
    public String solution(String s, int n) {
        String answer = "";
        char[] arr = s.toCharArray();
        int[] a = new int[arr.length];
        for (int i = 0; i < arr.length; i++){
            if(arr[i] != ' '){
                a[i] = arr[i]; // 따로 캐스팅 하지않아도 바로 들어간다.
                if(a[i] >=65 && a[i] <= 90){
                    a[i] = a[i] +n; // 일단 n 만큼 증가시키고
                    if(a[i] > 90) a[i] -= 26;
                }else if(a[i] >=97 && a[i] <= 122){
                    a[i] += n;
                    if(a[i] > 122) a[i] -= 26;
                }
            }else{
                a[i] = 32; // space 를 나태내는 아스키코드 숫자 32
            }
        }
        for (int i = 0; i < arr.length; i++){
            arr[i] = (char)a[i];
            answer += arr[i];
        }

        return answer;
    }
}
