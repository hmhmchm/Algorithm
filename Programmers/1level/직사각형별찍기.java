import java.util.Scanner;

public class 직사각형별찍기 {
    public static void main(String[] args) {
        // 별 문자를 이용해서 가로가 n , 세로가 m인 직사각형 형태를 출력하라.

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = 0; i < b; i++){
            for (int j = 0; j < a; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
