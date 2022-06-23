package samsung;

public class 셀프넘버 {
    static boolean[] b;

    public static void main(String[] args) {
        b = new boolean[10001];

        int n = 0, n1 = 0; // 생성자들의 부모 , 나머지
        int sum = 0; // 본체 외 합
        for (int i = 1; i < 10001; i++){
            int tmp = i; //
            while(tmp > 0){
                n1 = tmp % 10;
                sum += n1;
                tmp = tmp / 10;
            }
            n = i + sum;
            if(n <= 10000){
                b[n] = true;
            }
            sum = 0;
        }

        for (int i = 1; i < 10001; i++){
            if(!b[i]){
                System.out.println(i);
            }
        }

    }
}
