import java.util.Scanner;

public class 컵홀더 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int cupple = 0 , single = 1;
        sc.nextLine();
        String[] str = sc.nextLine().split("");
        for (int i = 0; i < str.length; i++){
            if(str[i].equals("S")){
                single++;
            }
            if(str[i].equals("L")){
                cupple++;
            }
            if(cupple%2 != 0) single++;
        }
        if(single > N){
            System.out.println(N);
        }else {
            System.out.println(single);
        }
    }
}
