import java.util.ArrayList;
import java.util.Scanner;

public class 쉽게푸는문제 {
    static int A;
    static int B;
    static int sum,cnt,j;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        B = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();
        cnt = 0; j = 1;

        for (int i = 0; i < B; i ++){
            list.add(j); // 먼저 넣어
            cnt++;
            if (j == cnt){
                j++;
                cnt = 0;
            }
        }
        sum = 0;
        for (int i = A-1; i < B; i++){
            sum += list.get(i);
        }

        System.out.println(sum);
    }
}
