import java.util.Arrays;
import java.util.Scanner;

public class 일곱난쟁이 {
    static int[] people; // 9명 난쟁이
    static boolean check; // 방문체크배열
    static int[] realPeople; // 진짜 7명 난쟁이
    static int sum;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        people = new int[9]; // 난쟁이가 9명
        realPeople = new int[7];
        for (int i = 0; i < 9; i++){
            people[i] = sc.nextInt();
        }
        Arrays.sort(people);
        combination(0, 0);
    }

    public static void combination(int start, int cnt){
        if(check == true)return;
        if(cnt == 7){
            sum = 0;
            for (int i = 0; i < realPeople.length ; i++){
                sum += realPeople[i];
            }
            if(sum == 100){
                check=true;
                for (int data: realPeople
                     ) {
                    System.out.println(data);
                }
            }
            return;
        }
        for (int i = start; i < people.length; i++){
            realPeople[cnt] = people[i];
            combination(i+1, cnt+1);
        }
    }
}
