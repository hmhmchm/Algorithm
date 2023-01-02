public class 숫자의표현 {
    
    public int solution(int n) {
        int answer = 0;
        int num = 0;

        for (int i = 1; i <= n / 2; i++) {
            num = 0;
            for (int j = i; j <= n; j++) {
                // 같거나 작으면 계속 더한다.
                num += j;

                if (num == n) {
                    answer++;
                    break;
                } else if (num > n) {
                    break;
                }
            }
        }
        return answer + 1;
    }
//    static int n;
//
//    public static void main(String[] args) {
//        int num = 0;
//        int answer = 0;
//        n = 15;
//
//        for (int i = 1; i <= n/2 ; i++){
//            num = 0;
//            for (int j = i; j <= n/2 ; j++){
//
//                // 같거나 작으면 계속 더한다.
//                if (num < n) {
//                    num += j;
//                }
//
//                if (num == n) {
//                    answer++;
//                    break;
//                }
//            }
//        }
//
//        System.out.println(answer+1);
//
//    }
}
