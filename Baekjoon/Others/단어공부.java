import java.util.Scanner;

class 단어공부 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next().toUpperCase();
        int[] arr = new int[26];
        int max = -9999;
        char answer = 'a';
        for (int i = 0; i < str.length(); i++){
            arr[str.charAt(i)-65]++;
            if(max < arr[str.charAt(i) - 65]){
                max = arr[str.charAt(i) - 65];
                answer = str.charAt(i);
            }else if(max == arr[str.charAt(i) - 65]){
                answer = '?';
            }
        }
        System.out.println(answer);
    }
}
