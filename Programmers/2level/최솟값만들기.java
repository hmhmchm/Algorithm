import java.util.Arrays;
import java.util.Collections;

public class 최솟값만들기 {

    public int solution(int []A, int []B)
    {
        int answer = 0;
        Integer[] B1 = new Integer[B.length];

        for(int i = 0; i < B.length; i++){
            B1[i] = B[i];
        }
        Arrays.sort(A); // 오름차순
        Arrays.sort(B1, Collections.reverseOrder()); // 내림차순

        for (int i = 0; i < A.length; i++){
            answer += A[i]*B1[i];
        }

        return answer;
    }
    // test
//    static Integer[] A = {1,2};
//    static Integer[] B = {3,4};
//
//    public static void main(String[] args) {
//        int min = 0;
//        Integer[] B1 = new Integer[B.length];
//        Arrays.sort(A); // 오름차순
//        Arrays.sort(B1, Collections.reverseOrder()); // 내림차순
//
//        for (int i = 0; i < A.length; i++){
//            min += A[i]*B[i];
//        }
//
//        System.out.println(min);
//    }
}
