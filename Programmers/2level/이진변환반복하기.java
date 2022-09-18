import java.util.Arrays;

public class 이진변환반복하기 {
    public static void main(String[] args) {
        // 출려 값 [총 이진변환 수, 총 제거한 0의 개수]
        String s = "110010101001";
        int[] answer = new int[2];
        while (1 < s.length()) {
            int cnt = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '0') {
                    answer[1]++;
                } else {
                    cnt++; // 1개수 세기
                }
            }
            s = Integer.toBinaryString(cnt);
            answer[0]++;
        }

        System.out.println(Arrays.toString(answer));
    }
}
